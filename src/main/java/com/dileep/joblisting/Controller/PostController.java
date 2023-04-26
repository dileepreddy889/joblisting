package com.dileep.joblisting.Controller;

import com.dileep.joblisting.Repository.PostRepo;
import com.dileep.joblisting.Repository.SearchRepository;
import com.dileep.joblisting.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepo postRepo;

    @Autowired
    SearchRepository searchRepository;
    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        List<Post> list = postRepo.findAll();
        return list;
    }

    @PostMapping("/addField")
    public Post addField(@RequestBody Post post){
        postRepo.save(post);
        return post;
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){

        return searchRepository.findByText(text);
    }
}
