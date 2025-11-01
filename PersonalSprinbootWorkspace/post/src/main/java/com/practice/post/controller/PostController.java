package com.practice.post.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.post.data.PostFetcher;
import com.practice.post.model.Post;
import com.practice.post.constants.Constants;

@RestController
@RequestMapping("/api")
public class PostController {

	 @GetMapping("/getPosts")
	    public List<Post> getUserIdAndId() {
	        // Example URL for fetching JSON data
	        String apiUrl = Constants.URL;

	        try {
	            return PostFetcher.fetchUserIdAndIdData(apiUrl);
	        } catch (IOException e) {
	            e.printStackTrace();
	            // In a real application, handle exceptions appropriately (e.g., return an error response)
	            return null;
	        }
	    }
	}