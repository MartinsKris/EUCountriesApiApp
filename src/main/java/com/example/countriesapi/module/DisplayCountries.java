package com.example.countriesapi.module;

import lombok.Data;
import java.util.List;

@Data
public class DisplayCountries {
    private String name;
    private String capital;
    private List<Currency> currencies;
    private Integer population;

    public DisplayCountries(String name, String capital, List<Currency> currencies, Integer population){
        this.name = name;
        this.capital = capital;
        this.currencies = currencies;
        this.population = population;
    }
}
