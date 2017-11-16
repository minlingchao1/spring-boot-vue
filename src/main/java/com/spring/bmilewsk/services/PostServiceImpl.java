package com.spring.bmilewsk.services;

import com.spring.bmilewsk.data.entity.Post;
import com.spring.bmilewsk.data.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository repository;

    @Override
    public List<Post> findAll() {
        List<Post> posts = new ArrayList<>();
        Iterable<Post> results = this.repository.findAll();
        results.forEach(room -> {
            posts.add(room);
        });
        return posts;
    }

    @Override
    public List<Post> findLatest5() {
        List<Post> posts = new ArrayList<>();
        Iterable<Post> results = this.repository.findAll();
        return posts.stream()
                .limit(5)
                .collect(Collectors.toList());
    }

    @Override
    public Post findBySlug(String slug) {
        return null;
    }

    @Override
    public Post create(Post post) {
        return null;
    }

    @Override
    public Post edit(Post post) {
        return null;
    }

    @Override
    public void deleteBySlug(Long slug) {

    }
}
