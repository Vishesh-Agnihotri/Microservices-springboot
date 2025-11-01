package com.example.demo.service;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class AiService {

	private final OpenAiChatModel aiChatModel;

	public AiService(OpenAiChatModel aiChatModel) {
		this.aiChatModel = aiChatModel;
	}

	public String generateResponse(String prompt) {
		return aiChatModel.call(prompt);
	}

}
