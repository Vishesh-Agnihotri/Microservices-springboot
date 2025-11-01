package com.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.model.Model;

@RestController
public class Controller {

	@Value("${countries.api}")
	private String api;
	
	@GetMapping("/countries")
	public Model[] getModel() {
		String apiUrl=api;
		RestTemplate restTemplate= new RestTemplate();
		Model[] model=restTemplate.getForObject(apiUrl, Model[].class);
		return model;
	}
}
