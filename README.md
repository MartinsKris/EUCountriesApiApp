# EUCountriesApiApp

Java Spring Boot app

IntelliJ IDEA 2021.2.2 was used for development.

---

### What it does
Application displays different Tops of countries depending on selected criteria.

### How to run
Clone repository to Your local drive and open cloned folder or "countriesApi.iml" with Java IDE in e.g. IntelliJ IDEA 2021.2.2.
In IDE locate src folder and in src folder find Java file "CountriesApiAplication". 
With mouse right click on "CountriesApiAplication" file and select "Run 'CountriesApiAplication.main()'".
<img src = "images/runCountriesApiLong.png">

Open web browser. enter following web address: http://localhost:8080/countries which will display all European Union countries.
<img src = "images/browserSetupCountries.png">

Output could differ from example depending on EU country information in that moment.
<img src = "images/countriesOutput.png">

To apply Top 10 filters, in browser change "countries" to "topbyarea" to get top 10 countries comparison by area.
<img src = "images/browserSetupByArea.png">

And output should be similar to this:
<img src = "images/byAreaOutput">

"topbypopulation" will display top 10 countries by population and "topbydensity" will display top 10 countries by population density.

### Tests
Unit test tests if ten countries are added to Top 10 filters as by requirement.
To run Unit Tests, under test folder locate file "CountriesApiApplicationTests" and select "Run 'CountriesApiApplicationTests'"
<img src = "images/runTests.png">

### Could be improved
Integration tests could be applied.