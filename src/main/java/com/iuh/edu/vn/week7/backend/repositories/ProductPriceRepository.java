package com.iuh.edu.vn.week7.backend.repositories;

import com.iuh.edu.vn.week7.backend.models.ProductPrice;
import com.iuh.edu.vn.week7.backend.pks.ProductPricePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, ProductPricePK> {
}