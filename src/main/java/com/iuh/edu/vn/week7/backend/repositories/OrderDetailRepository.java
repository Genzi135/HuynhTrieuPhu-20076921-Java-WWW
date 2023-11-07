package com.iuh.edu.vn.week7.backend.repositories;

import com.iuh.edu.vn.week7.backend.models.OrderDetail;
import com.iuh.edu.vn.week7.backend.pks.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {
}