package com.iuh.edu.vn.week4.repositories;

import com.iuh.edu.vn.week4.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}