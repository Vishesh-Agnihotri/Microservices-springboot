package com.test.personal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.personal.model.SolarFlare;

@RestController
@RequestMapping("/api/nasa-donki")
public class NasaDonkiController {

    @Value("${nasa.api.key}")
    private String nasaApiKey;  // Make sure to add your NASA API key in your application properties file

    @GetMapping("/flr-data")
    public SolarFlare[] getFlareData() {
        // Define the API URL
        String apiUrl = "https://api.nasa.gov/DONKI/FLR?startDate=2016-01-01&endDate=2016-01-30&api_key=" + nasaApiKey;

        // Use RestTemplate to make the API request and deserialize the JSON response
        RestTemplate restTemplate = new RestTemplate();
        SolarFlare[] flareData = restTemplate.getForObject(apiUrl, SolarFlare[].class);

        return flareData;
    }
}
