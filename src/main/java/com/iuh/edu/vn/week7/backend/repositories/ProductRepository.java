package com.iuh.edu.vn.week7.backend.repositories;

import com.iuh.edu.vn.week7.backend.enums.ProductStatus;
import com.iuh.edu.vn.week7.backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Transactional
    @Modifying
    @Query("""
            update Product p set p.name = ?1, p.manufacturer = ?2, p.description = ?3, p.unit = ?4, p.status = ?5
            where p.product_id = ?6""")
    void updateProduct(String name, String manufacturer, String description, String unit, ProductStatus status, long product_id);
}