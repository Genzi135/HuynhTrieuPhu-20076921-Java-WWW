package com.iuh.edu.vn.week7.frontend.controllers;

import com.iuh.edu.vn.week7.backend.models.Product;
import com.iuh.edu.vn.week7.backend.models.ProductPrice;
import com.iuh.edu.vn.week7.backend.repositories.ProductPriceRepository;
import com.iuh.edu.vn.week7.backend.repositories.ProductRepository;
import com.iuh.edu.vn.week7.backend.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class ProductController {
    @Autowired
    ProductServices productServices;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductPriceRepository productPriceRepository;

    @GetMapping("/products")
    public String showProductListPaging(Model model,
                                          @RequestParam("page") Optional<Integer> page,
                                          @RequestParam("size") Optional<Integer> size){
        int currentPage=page.orElse(1);
        int pageSize=size.orElse(10);

        Page<Product> productPage = productServices.findPaginated(currentPage-1, pageSize,
                "name", "asc");

        model.addAttribute("productPage", productPage);

        int totalPages=productPage.getTotalPages();
        if (totalPages>0){
            List<Integer> pageNumbers= IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumber", pageNumbers);

        }
        return "admin/product/listing";
    }

    @GetMapping("/show-add-form")
    public String add(Model model){
        Product product=new Product();
        model.addAttribute("product", product);
        return "admin/product/add-form";
    }

    @PostMapping("/products/add")
    public String addProduct(@ModelAttribute("product") Product product,  BindingResult result, Model model){
        productRepository.save(product);
        model.addAttribute("product_id", product.getProduct_id());
        return "redirect:/show-form-add-price?product_id=" +product.getProduct_id();
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable("id") long id){
        Product product=productRepository.findById(id).orElse(new Product());
        productRepository.delete(product);
        return "redirect:/products";
    }

    @GetMapping("/products/show-update-product/{id}")
    public String showUpdateProduct(@PathVariable("id") long id, Model model){
        Product product=productRepository.findById(id).orElse(new Product());
        if (product==null){
            return "redirect:/products";
        }
        model.addAttribute("product", product);
        return "admin/product/update-form";
    }

    @PostMapping("/products/update-product")
    public String updateProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes){
        Long productID=product.getProduct_id();
        Product existingProduct=productRepository.findById(productID).orElse(new Product());
        if (existingProduct==null){
            return "redirect:/products";
        }
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setManufacturer(product.getManufacturer());
        existingProduct.setUnit(product.getUnit());
        existingProduct.setStatus(product.getStatus());

        productRepository.save(existingProduct);

        redirectAttributes.addFlashAttribute("success message", "sản phẩm đã được cập nhật thành công");
        return "redirect:/products";
    }

    @GetMapping("/show-form-add-price")
    public String addPrice(@RequestParam("product_id") long productId, Model model) {
        Product product = productRepository.findById(productId).orElse(null);

        if (product == null) {
            return "redirect:/error";
        }

        ProductPrice price = new ProductPrice();
        price.setProduct(product);
        model.addAttribute("productPrice", price);
        return "admin/product/add-price-form";
    }

    @PostMapping("/products/add-price-form")
    public String addProductPrice(@ModelAttribute("productPrice") ProductPrice productPrice, Model model){
        if (productPrice.getPrice_date_time()==null){
            productPrice.setPrice_date_time(LocalDateTime.now());
        }
        productPriceRepository.save(productPrice);
        return "redirect:/products";

    }

}
