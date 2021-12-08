package com.united.steps.regression;

import com.united.page_elements.travel_panel_elements.Flights_Status_tab;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Flight_status_steps {


    @When("home page loaded click Flight status tab")
    public void home_page_loaded_click_flight_status_tab() {
        Flights_Status_tab flights_status_tab = new Flights_Status_tab();
        flights_status_tab.getFlight_status_btn().click();
    }

    @Then("fill out form and click Search button")
    public void fill_out_form_and_click_search_button() {
        Flights_Status_tab flights_status_tab = new Flights_Status_tab();
        flights_status_tab.fillout_form();
    }

    @Then("verify that the result is displayed")
    public void verify_that_the_result_is_displayed() {
        Flights_Status_tab flights_status_tab = new Flights_Status_tab();
        int result = flights_status_tab.getSearch_result_list().size();
        System.out.println(result);
        Assert.assertTrue(result > 0);
    }

    @Then("fill out Flight number finput with latters and click Enter")
    public void fill_out_flight_number_finput_with_latters_and_click_enter() {
        Flights_Status_tab flights_status_tab = new Flights_Status_tab();
        flights_status_tab.getInputs().get(2).sendKeys("qwer" + Keys.ENTER);
    }
    @Then("verify that the Please enter a valid flight number message displayed")
    public void verify_that_the_please_enter_a_valid_flight_number_message_displayed() {
        Flights_Status_tab flights_status_tab = new Flights_Status_tab();
        String text = flights_status_tab.getMessage_input_element().getText();
        Assert.assertTrue(text.contains("Please enter a valid flight number."));
    }

    @Then("fill out Flight number input with invalid flight number")
    public void fill_out_flight_number_input_with_invalid_flight_number() {
        Flights_Status_tab flights_status_tab = new Flights_Status_tab();
        flights_status_tab.getInputs().get(2).sendKeys("6565" + Keys.ENTER);
    }
    @Then("verify that the message The number you entered is not a valid flight number is displayed")
    public void verify_that_the_message_the_number_you_entered_is_not_a_valid_flight_number_is_displayed() {
        Flights_Status_tab flights_status_tab = new Flights_Status_tab();
        String text = flights_status_tab.getMessage_page_element().getText();
        Assert.assertTrue(text.contains("The number you entered is not a valid flight number"));
    }



}
