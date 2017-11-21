package com.spring.bmilewsk.controllers;

import com.spring.bmilewsk.data.entity.Post;
import com.spring.bmilewsk.services.AccountService;
import com.spring.bmilewsk.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    List<Post> findAll() {
        return postService.findAll();
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET, params = {"slug"})
    Post findBySlug(@RequestParam() String slug) {
        return postService.findBySlug(slug);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET, params = {"author"})
    List<Post> findByUserId(@RequestParam() Long author) {
        this.validateUser(author);
        return postService.findByAccountId(author);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    Post findOne(@PathVariable(value = "id") Long id) {
        return postService.findOne(id);
    }

    private void validateUser(Long author) {
        this.accountService.findById(author).orElseThrow(
                () -> new UserNotFoundException(author));
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    private class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(Long author) {
            super("Could not find an author: '" + author + "'.");
        }
    }
}
