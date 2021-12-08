package com.united.steps.regression;

import com.united.page_elements.travel_panel_elements.My_trip_tab;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class My_trips_steps {

    @When("home page loaded click My Trips tab")
    public void home_page_loaded_click_my_trips_tab() {
        My_trip_tab my_trip_tab = new My_trip_tab();
        my_trip_tab.getTripsTab_btn().click();
    }
    @Then("click Find your travel credits link")
    public void click_find_your_travel_credits_link() {
        My_trip_tab my_trip_tab = new My_trip_tab();
        my_trip_tab.getTravel_credits_link().click();
    }
    @Then("verify that the United Travel Credits page loaded successfully")
    public void verify_that_the_united_travel_credits_page_loaded_successfully() {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.united.com/en/US/fly/travel/credit.html";
        Assert.assertEquals(currentUrl, expectedUrl);
    }

    @Then("click search button")
    public void click_search_button() {
        My_trip_tab my_trip_tab = new My_trip_tab();
        my_trip_tab.getSearch_btn().click();
    }

    @Then("verify that the messages are displayed")
    public void verify_that_the_messages_are_displayed() {
        My_trip_tab my_trip_tab = new My_trip_tab();
        boolean displayed1 = my_trip_tab.getConfirmationNumber_elementl().isDisplayed();
        boolean displayed2 = my_trip_tab.getLastName_aria_elementl().isDisplayed();
        Assert.assertTrue(displayed1);
        Assert.assertTrue(displayed2);
    }
}
