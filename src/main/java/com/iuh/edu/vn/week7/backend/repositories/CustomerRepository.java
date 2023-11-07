package com.iuh.edu.vn.week7.backend.repositories;

import com.iuh.edu.vn.week7.backend.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}