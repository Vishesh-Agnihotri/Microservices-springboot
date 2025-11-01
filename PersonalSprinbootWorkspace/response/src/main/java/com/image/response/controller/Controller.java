package com.image.response.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.image.response.constants.Constants;
import com.image.response.model.ImageApiResponse;

@RestController
public class Controller {

	@Value("${nasa.image.api.key}")
	private String apiKey;
	
	@GetMapping("image")
	public ImageApiResponse getImageApiResponses() {
		String apiUrl=Constants.api+apiKey;
		RestTemplate restTemplate = new RestTemplate();
		ImageApiResponse data = restTemplate.getForObject(apiUrl,ImageApiResponse.class);
		return data;
		}
}
