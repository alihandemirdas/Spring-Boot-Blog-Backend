package com.katreo.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katreo.blog.entity.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    List<BlogPost> findByAuthorId(Long authorId);
}
