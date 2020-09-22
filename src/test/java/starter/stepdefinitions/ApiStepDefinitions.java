package starter.stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.apache.http.HttpStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.junit.Assert.assertThat;

import static org.assertj.core.api.Assertions.assertThat;


public class ApiStepDefinitions {
    @Before
    public void set_the_base_uri() {
        RestAssured.baseURI="http://localhost:3000/api/";
    }

    @When("I call the restaurant API with customer {word} and restaurant {word}")
    public void i_call_the_restaurant_api(String customerId, String restaurantId) {
        given().header("Content-Type", "application/json");
        when().get("customers/{customerId}/restaurants/{restaurantId}", customerId, restaurantId);

        // Verify status code 200 or ok
        then().statusCode(HttpStatus.SC_OK);
        then().statusCode(200);
    }

    @When("I call a fake customerId {word}")
    public void i_call_customer_api_with_fake_customer(String customerId) {
        given().header("Content-Type", "application/json");
        when().get("customers/{customerId}", customerId);

        // Verify status code 404 NOT FOUND
        then().statusCode(HttpStatus.SC_NOT_FOUND);
        then().statusCode(404);
    }
}