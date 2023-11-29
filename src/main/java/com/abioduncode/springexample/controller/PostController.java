package com.abioduncode.springexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.abioduncode.springexample.services.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {

  private final PostService postService;
  private final RestTemplate restTemplate;

  public PostController(PostService postService, RestTemplate restTemplate){
    this.postService =new PostService();
    this.restTemplate = new RestTemplate();
  }
  
  @GetMapping("/")
  public String findAll(){
    return postService.findAll();
  }

  @GetMapping("/load")
  public String loadPosts(){
    return "load post";
  }
}
