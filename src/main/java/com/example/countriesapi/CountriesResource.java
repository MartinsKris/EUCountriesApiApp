package com.example.countriesapi;

import com.example.countriesapi.module.Countries;

public class CountriesResource {
    private Countries countries;

    public CountriesResource(Countries countries){
        this.countries = countries;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries newCountries) {
        this.countries = newCountries;
    }
}
