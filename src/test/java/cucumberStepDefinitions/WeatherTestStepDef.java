package cucumberStepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.math.BigDecimal;

public class WeatherTestStepDef {
    @When("we are requesting weather")
    public void get_weather_result() {

    }
    @Then("LON should be (.*)")
    public void check_lon(BigDecimal lon){

    }
    @Then("LAT should be (.*)")
    public void check_lat(BigDecimal lat){

    }
}
