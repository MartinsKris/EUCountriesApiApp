package com.example.countriesapi.module;

import lombok.Data;
import java.util.List;

@Data
public class Countries {
    private String name;
    private String capital;
    private List<Currency> currencies;
    private Integer population;
    private Integer area;
}
