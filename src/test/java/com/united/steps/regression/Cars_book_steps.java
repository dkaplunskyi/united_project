package com.united.steps.regression;

import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import com.united.page_elements.travel_panel_elements.book_tab.Car_subtab;
import com.united.utility.Common;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hooks.driver;

public class Cars_book_steps {

    @When("home page loaded click Car subtab in Book tab")
    public void home_page_loaded_click_car_subtab_in_book_tab() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getCar_subtab_btn().click();
    }

    @Then("verify that the fields and buttons are present")
    public void verify_that_the_fields_and_buttons_are_present() {
        Car_subtab car__subtab = new Car_subtab();
        boolean result = car__subtab.fields_and_buttons_present();
        Assert.assertTrue(result);
    }

    @Then("check Return car to same location and primary driver is Twenty-five checkboxes if it's unckeked")
    public void check_return_car_to_same_location_and_primary_driver_is_twenty_five_checkboxes_if_it_s_unckeked() {
        Car_subtab car__subtab = new Car_subtab();
        WebElement checkbox1 = car__subtab.getSame_location_checkbox();
        WebElement checkbox2 = car__subtab.getAge_checkbox();
        if (checkbox1.getAttribute("value").equals("false") && checkbox2.getAttribute("value").equals("false")) {
            checkbox1.click();
            checkbox2.click();
        }
    }

    @Then("verify that the Drop off location field not displayed")
    public void verify_that_the_drop_off_location_field_not_displayed() {
        Car_subtab car__subtab = new Car_subtab();
        int size = car__subtab.getInputs().size();
        Assert.assertEquals(size, 6);
    }

    @Then("fill out Going to and Dates and click Find cars button")
    public void fill_out_going_to_and_dates_and_click_find_cars_button() {
        Car_subtab car__subtab = new Car_subtab();
        car__subtab.fill_out_fields_and_dates("Miami", 30, 2);
        int size = car__subtab.getButtons().size();
        car__subtab.getButtons().get(size - 1).click();
    }

    @Then("verify that the new page loaded successfully with car results")
    public void verify_that_the_new_page_loaded_successfully_with_car_results() {
        Car_subtab car__subtab = new Car_subtab();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        int size = car__subtab.getSearch_resul_list().size();
        Assert.assertTrue(size > 0);
    }

    @Then("check Book with miles checkbox")
    public void check_book_with_miles_checkbox() {
        Car_subtab car__subtab = new Car_subtab();
        car__subtab.getInputs().get(5).click();
    }

    @Then("verify that the new page loaded successfully with car mileage results")
    public void verify_that_the_new_page_loaded_successfully_with_car_mileage_results() {
        Car_subtab car__subtab = new Car_subtab();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        for (WebElement i : car__subtab.getSearch_miles_resul_list()) {
            Common.waitUntilVisibility(i);
            String text = i.getText();
            Assert.assertEquals(text, "miles");
        }
    }

    @Then("check Primary Driver is Twenty-one or older checkbox if it's unckecked")
    public void check_primary_driver_is_twenty_one_or_older_checkbox_if_it_s_unckecked() {
        Car_subtab car__subtab = new Car_subtab();
        String value = car__subtab.getAge_checkbox().getAttribute("value");
        if (value.equals("true")) {
            car__subtab.getAge_checkbox().click();
        }
    }

    @Then("fill out age input with less that Twenty-one")
    public void fill_out_age_input_with_less_that_twenty_one() {
        Car_subtab car__subtab = new Car_subtab();
        car__subtab.getDrivers_age_input().sendKeys("18");
    }

    @Then("verify that the new page has correct message")
    public void verify_that_the_new_page_has_correct_message() {
        Car_subtab car__subtab = new Car_subtab();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String text = car__subtab.getSearch_result_driver_messages().get(0).getText();
        Assert.assertTrue(text.contains("Some car rental suppliers do not rent to young drivers"));
    }

    @Then("fill out age input with Twenty-one")
    public void fill_out_age_input_with_twenty_one() {
        Car_subtab car__subtab = new Car_subtab();
        car__subtab.getDrivers_age_input().sendKeys("21");
    }
    @Then("verify that the new page has correct message without search result")
    public void verify_that_the_new_page_has_correct_message_without_search_result() {
        Car_subtab car__subtab = new Car_subtab();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String text = car__subtab.getSearch_result_driver_messages().get(0).getText();
        Assert.assertTrue(text.contains("We couldn't find any results matching your criteria, but changing your search may help."));
    }

    @Then("fill out age input with more that Twenty-one")
    public void fill_out_age_input_with_more_that_twenty_one() {
        Car_subtab car__subtab = new Car_subtab();
        car__subtab.getDrivers_age_input().sendKeys("22");
    }

}
