package com.genelab.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.genelab.model.GeneLab;

@RestController
public class GenelabController {

	@Value("${genelab.api.key}")
	private String apiKey;

	@GetMapping("/geneLab")
	public GeneLab getFlareData() {
		String apiUrl = "https://osdr.nasa.gov//genelab/data/glds/files/%7bGLDS_STUDY_IDs%7d/?page=%7bCURRENT_PAGE_NUMBER%7d&size=%7bRESULTS_PER_PAGE%7d";

		RestTemplate restTemplate = new RestTemplate();
		GeneLab data = restTemplate.getForObject(apiUrl, GeneLab.class); // Taking Genelab here and not GeneLab[] as in
																			// post project because here only one data
																			// is coming in postman but there multiple
																			// data was there

		return data;

	}}

