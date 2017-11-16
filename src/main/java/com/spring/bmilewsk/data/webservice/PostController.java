package com.spring.bmilewsk.data.webservice;

import com.spring.bmilewsk.data.entity.Post;
import com.spring.bmilewsk.data.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostRepository repository;

    @CrossOrigin()
    @RequestMapping(value="/posts", method= RequestMethod.GET)
    List<Post> findAll(@RequestParam(required=false) String slug){
        List<Post> rooms = new ArrayList<>();
        if(null==slug){
            Iterable<Post> results = this.repository.findAll();
            results.forEach(room -> {rooms.add(room);});
        }else{
            Post room = this.repository.findBySlug(slug);
            if(null!=room) {
                rooms.add(room);
            }
        }
        return rooms;
    }
}
