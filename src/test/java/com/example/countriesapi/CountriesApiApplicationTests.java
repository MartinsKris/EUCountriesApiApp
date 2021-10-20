package com.example.countriesapi;

import com.example.countriesapi.models.GetTopByArea;
import com.example.countriesapi.models.GetTopByDensity;
import com.example.countriesapi.models.GetTopByPopulation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountriesApiApplicationTests {

    @Test
    void getTop_newTopTenByAreaAndExpectedCountTen_TrueIfReceivedCountIsTen() {
        //Arrange
        var expectedCount = 10;

        //Act
        var areaTop = new GetTopByArea().getTop();

        //Assert
        assertEquals(areaTop.size(), expectedCount);
    }

    @Test
    void getTop_newTopTenByPopulationAndExpectedCountTen_TrueIfReceivedCountIsTen() {
        //Arrange
        var expectedCount = 10;

        //Act
        var populationTop = new GetTopByPopulation().getTop();

        //Assert
        assertEquals(populationTop.size(), expectedCount);
    }

    @Test
    void getTop_newTopTenByDensityAndExpectedCountTen_TrueIfReceivedCountIsTen() {
        //Arrange
        var expectedCount = 10;

        //Act
        var densityTop = new GetTopByDensity().getTop();

        //Assert
        assertEquals(densityTop.size(), expectedCount);
    }
}
