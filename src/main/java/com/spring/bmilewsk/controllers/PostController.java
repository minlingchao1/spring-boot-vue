package com.spring.bmilewsk.controllers;

import com.spring.bmilewsk.services.PostService;
import com.spring.bmilewsk.data.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @CrossOrigin()
    @RequestMapping(method= RequestMethod.GET)
    List<Post> findAll(){
        return postService.findAll();
    }
}
