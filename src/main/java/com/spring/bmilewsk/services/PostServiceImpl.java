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
        results.forEach(room -> {
            posts.add(room);
        });
        return posts.stream()
                .limit(5)
                .collect(Collectors.toList());
    }

    @Override
    public List<Post> findByAccountId(Long id) {
        List<Post> posts = new ArrayList<>();
        Iterable<Post> results = repository.findByAccountId(id);
        results.forEach(room -> {
            posts.add(room);
        });
        return posts;
    }

    @Override
    public Post findBySlug(String slug) {
        Post post = repository.findBySlug(slug);
        return post;
    }

    @Override
    public Post findOne(Long id) {
        Post post = repository.findOne(id);
        return post;
    }

    @Override
    public Post save(Post post){
        return repository.save(post);
    }

    @Override
    public Post edit(Post post) {
        return null;
    }

    @Override
    public void deleteBySlug(Long slug) {

    }
}
