package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AiService;

@RestController
public class AiController {

	private final AiService aiService;

	public AiController(AiService aiService) {
		this.aiService = aiService;

	}

	@GetMapping("/ask")
	public String askAi(@RequestParam String prompt) {
		return aiService.generateResponse(prompt);
	}
}
