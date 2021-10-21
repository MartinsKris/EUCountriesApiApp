package com.example.countriesapi.apiController;

import com.example.countriesapi.module.Countries;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class ApiController {
    private RestTemplate restTemplate = new RestTemplate();

    String url = "https://restcountries.com/v2/regionalbloc/eu";

    @GetMapping("/countries")
    public List<Countries> getCountries(){
        Countries[] countries =  restTemplate.getForObject(url, Countries[].class);

        return Arrays.asList(countries);
    }
}