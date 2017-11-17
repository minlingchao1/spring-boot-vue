package com.spring.bmilewsk.controllers;

import com.spring.bmilewsk.services.PostService;
import com.spring.bmilewsk.data.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PostController {

    @Autowired
    private PostService postService;

    @CrossOrigin()
    @RequestMapping(value="/posts", method= RequestMethod.GET)
    List<Post> findAll(){
        return postService.findAll();
    }

    @CrossOrigin()
    @RequestMapping(value="/posts", method= RequestMethod.GET, params={"slug"})
    Post findBySlug(@RequestParam(required = false) String slug){
        return postService.findBySlug(slug);
    }

    @CrossOrigin()
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    Post findOne(@PathVariable(value = "id") Long id) {
        return postService.findOne(id);
    }
}
