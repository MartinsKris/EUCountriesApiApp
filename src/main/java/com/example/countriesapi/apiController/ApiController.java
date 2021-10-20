package com.example.countriesapi.apiController;

import com.example.countriesapi.module.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class ApiController {

    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

    private static String url = "https://restcountries.com/v2/regionalbloc/eu";

    public String getUrl(){
        return url;
    }

    @GetMapping("/countries")
    public List<Countries> getCountries(){
        Countries[] countries =  restTemplate.getForObject(url, Countries[].class);

        return Arrays.asList(countries);
    }
}