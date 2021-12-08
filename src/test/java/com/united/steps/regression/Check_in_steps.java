package com.united.steps.regression;

import com.united.page_elements.travel_panel_elements.Check_in_tab;
import com.united.utility.Common;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Check_in_steps {

    @When("home page loaded click Check-in tab")
    public void home_page_loaded_click_check_in_tab() {
        Check_in_tab check_in_tab = new Check_in_tab();
        check_in_tab.getCheckIn_tab().click();
    }

    @Then("click on Search button")
    public void click_on_search_button() {
        Check_in_tab check_in_tab = new Check_in_tab();
        Common.waitUntilVisibility(check_in_tab.getSearch_btn());
        check_in_tab.getSearch_btn().click();
    }

    @Then("verify that the warning messages are displayed")
    public void verify_that_the_warning_messages_are_displayed() {
        Check_in_tab check_in_tab = new Check_in_tab();
        Common.waitUntilVisibility(check_in_tab.getFlightCheckInConfNumber_element());
        Common.waitUntilVisibility(check_in_tab.getFlightCheckInLastName_element());
        boolean confNumber_is_displayed = check_in_tab.getFlightCheckInConfNumber_element().isDisplayed();
        boolean checkInLastName_displayed = check_in_tab.getFlightCheckInLastName_element().isDisplayed();
        Assert.assertTrue(confNumber_is_displayed);
        Assert.assertTrue(checkInLastName_displayed);
    }

    @Then("click check-in details link")
    public void click_check_in_details_link() {
        Check_in_tab check_in_tab = new Check_in_tab();
        check_in_tab.getCheck_in_details_link().click();
    }

    @Then("verify that the page Check-in and Airport Processing Times loaded successfully")
    public void verify_that_the_page_check_in_and_airport_processing_times_loaded_successfully() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Check-in and Airport Processing Times");
    }

    @Then("click check-in with MilesPlus link")
    public void click_check_in_with_miles_plus_link() {
        Check_in_tab check_in_tab = new Check_in_tab();
        check_in_tab.getMileagePlus_link().click();
    }
    @Then("verify that the page check-in with MilesPlus link loaded successfully")
    public void verify_that_the_page_check_in_with_miles_plus_link_loaded_successfully() {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.united.com/en/us/checkin";
        Assert.assertEquals(currentUrl, expectedUrl);
    }
}
