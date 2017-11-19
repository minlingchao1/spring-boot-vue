package com.spring.bmilewsk.data.repository;

import com.spring.bmilewsk.data.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    Post findBySlug(String slug);
    List<Post> findByAccountId(Long id);
}
