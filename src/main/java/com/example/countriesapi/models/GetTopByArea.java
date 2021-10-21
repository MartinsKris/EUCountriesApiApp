package com.example.countriesapi.models;

import com.example.countriesapi.apiController.ApiController;
import com.example.countriesapi.services.GetTop;
import com.example.countriesapi.module.Countries;
import com.example.countriesapi.module.DisplayCountries;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.countriesapi.configuration.TopLimit.topLimit;

@RestController
public class GetTopByArea implements GetTop {

    ApiController api = new ApiController();

    @GetMapping("/topbyarea")
    @Override
    public List<DisplayCountries> getTop(){
        var topArea = api.getCountries()
                .stream()
                .filter(countries -> countries.getArea() != null)
                .sorted(Comparator.comparing(Countries::getArea)
                        .reversed()).limit(topLimit()).collect(Collectors.toList());

        return DisplayData.displayCountries(topArea);
    }
}
