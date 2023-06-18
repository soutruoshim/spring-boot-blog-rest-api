package com.srhdp.blogrestapi.repository;

import com.srhdp.blogrestapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
