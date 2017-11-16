package com.spring.bmilewsk.services;

import com.spring.bmilewsk.data.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findBySlug(String slug);
    Post create(Post post);
    Post edit(Post post);
    void deleteBySlug(Long slug);
}
