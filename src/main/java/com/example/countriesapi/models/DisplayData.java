package com.example.countriesapi.models;

import com.example.countriesapi.services.Display;
import com.example.countriesapi.module.Countries;
import com.example.countriesapi.module.DisplayCountries;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DisplayData implements Display {

    static List<DisplayCountries> displayCountries(List<Countries> getCountryTop) {
        List<DisplayCountries> displayTopDensity = new ArrayList<>();

        for (var country : getCountryTop) {
            var newCountry = new DisplayCountries(country.getName(), country.getCapital(),
                    country.getCurrencies(), country.getPopulation());
            displayTopDensity.add(newCountry);
        }

        return displayTopDensity.stream().collect(Collectors.toList());
    }
}
