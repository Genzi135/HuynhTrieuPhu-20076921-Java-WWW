package com.iuh.edu.vn.week6.repositories;

import com.iuh.edu.vn.week6.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}