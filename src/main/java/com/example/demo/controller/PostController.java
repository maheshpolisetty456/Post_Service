package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entiy.Post;

@RestController
@RequestMapping("/post")
public class PostController {

	@GetMapping("/id/{postId}")
	public Post getPost(@PathVariable("postId") String postId) {

	    System.out.println(" CONTROLLER HIT WITH postId = " + postId);

	    return new Post(postId, "Post Description for : " + postId);
	}
}
