package com.iuh.edu.vn.week7.backend.services;

import com.iuh.edu.vn.week7.backend.models.Product;
import com.iuh.edu.vn.week7.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
    @Autowired
    ProductRepository productRepository;

    public Page<Product> findPaginated(int pageNo, int pageSize, String sortBy, String sortDirection){
        Sort sort=Sort.by(Sort.Direction.fromString(sortDirection.toLowerCase()),sortBy);
        Pageable pageable= PageRequest.of(pageNo, pageSize, sort);
        return productRepository.findAll(pageable);
    }
}
