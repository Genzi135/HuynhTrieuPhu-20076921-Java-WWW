package com.iuh.edu.vn.week7.backend.repositories;

import com.iuh.edu.vn.week7.backend.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}