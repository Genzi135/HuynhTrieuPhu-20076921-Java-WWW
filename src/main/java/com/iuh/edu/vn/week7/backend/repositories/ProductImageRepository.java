package com.iuh.edu.vn.week7.backend.repositories;

import com.iuh.edu.vn.week7.backend.models.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}