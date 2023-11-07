package com.iuh.edu.vn.week7.frontend.controllers;

import com.iuh.edu.vn.week7.backend.models.Product;
import com.iuh.edu.vn.week7.backend.repositories.ProductRepository;
import com.iuh.edu.vn.week7.backend.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/products/add")
    public String addProduct(@ModelAttribute("product") Product product, BindingResult result, Model model){
        productRepository.save(product);
        return "redirect:/products";
    }

    @GetMapping("/products/detete/{id}")
    public String deleteProduct(@PathVariable("id") long id){
        Product product=productRepository.findById(id).orElse(new Product());
        productRepository.delete(product);
        return "redirect:/products";
    }
}
