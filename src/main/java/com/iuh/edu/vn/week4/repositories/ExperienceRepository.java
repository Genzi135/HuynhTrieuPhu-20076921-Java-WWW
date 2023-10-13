package com.iuh.edu.vn.week4.repositories;

import com.iuh.edu.vn.week4.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}