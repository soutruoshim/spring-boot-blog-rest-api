package com.srhdp.blogrestapi.repository;

import com.srhdp.blogrestapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}