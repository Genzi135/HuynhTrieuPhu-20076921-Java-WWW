package com.iuh.edu.vn.week4.repositories;

import com.iuh.edu.vn.week4.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {

}