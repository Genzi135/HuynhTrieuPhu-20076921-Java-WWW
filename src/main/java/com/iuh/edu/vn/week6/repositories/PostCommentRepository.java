package com.iuh.edu.vn.week6.repositories;

import com.iuh.edu.vn.week6.Models.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}