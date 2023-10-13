package com.iuh.edu.vn.week4.repositories;

import com.iuh.edu.vn.week4.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}