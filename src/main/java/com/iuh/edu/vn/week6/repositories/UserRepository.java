package com.iuh.edu.vn.week6.repositories;

import com.iuh.edu.vn.week6.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}