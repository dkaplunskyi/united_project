package com.united.steps.regression;

import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import com.united.pages.Reservations_Page;
import com.united.utility.Common;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Flight_book_steps {

    @When("click Round-trip radio button")
    public void click_round_trip_radio_button() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getRoundtrip_radio_btn().click();
        Assert.assertTrue(flightbook_tab.getRoundtrip_radio_btn().isSelected());
    }

    @Then("verify that the departing and return date fields are displayed")
    public void verify_that_the_departing_and_return_date_fields_are_displayed() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        boolean departure_result = flightbook_tab.getDepartDate_field().isDisplayed();
        boolean return_result = flightbook_tab.getReturnDate_field().isDisplayed();
        Assert.assertTrue(departure_result && return_result);
    }


    @When("click one way redio button")
    public void click_one_way_redio_button() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getOneway_radio_btn().click();
    }

    @Then("verify that the return date field is not displayed")
    public void verify_that_the_return_date_field_is_not_displayed() {
        int size = driver.findElements(By.cssSelector("#ReturnDate")).size();
        Assert.assertEquals(size, 0);
    }

    @When("home page loaded click Travelers field")
    public void home_page_loaded_click_travelers_field() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getTravelers_field_element().click();
    }

    @Then("increase adults travelers to max available number")
    public void increase_adults_travelers_to_max_available_number() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        for (int i = 0; i <= 10; i++) {
            flightbook_tab.getAdd_one_adult_btn().click();
        }
    }

    @Then("verify that the total travelers not more than nine")
    public void verify_that_the_total_travelers_not_more_than_nine() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        String counter_value = flightbook_tab.getAdults_counter().getAttribute("value");
        Assert.assertEquals(counter_value, "9");
    }

    @Then("add one passenger in every single passenger type")
    public void add_one_passenger_in_every_single_passenger_type() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        for (int i = 1; i < flightbook_tab.getPlus_sighs().size(); i++) {
            flightbook_tab.getPlus_sighs().get(i).click();
        }
    }

    @Then("verify that the fields has one added passenger")
    public void verify_that_the_fields_has_one_added_passenger() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        for (WebElement i : flightbook_tab.getTravelers_counter_inputs()) {
            String result = i.getAttribute("value");
            Assert.assertEquals(result, "1");
        }
    }

    @Given("fill out Origin text field input")
    public void fill_out_From_text_field_input() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getOrigin_input());
        flightbook_tab.getOrigin_input().click();
        flightbook_tab.getClean_origin_input_btn().click();
        flightbook_tab.getOrigin_input().sendKeys("Washington");
        Common.waitUntilVisibility(flightbook_tab.getAirport_element());
        flightbook_tab.getAirport_element().click();
        flightbook_tab.getOrigin_input().click();
    }

    @Then("fill out Destination text field input")
    public void fill_out_To_text_field_input() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getDest_input());
        flightbook_tab.getDest_input().clear();
        flightbook_tab.getDest_input().sendKeys("Los Angeles");
        Common.waitUntilVisibility(flightbook_tab.getAirport_element());
        flightbook_tab.getAirport_element().click();
        flightbook_tab.getDest_input().click();
    }

    @Then("click switch icon in the middle and verify that the Leaving from and Going to fields switched")
    public void click_switch_icon_in_the_middle_and_verify_that_the_Leaving_from_and_Going_to_fields_switched() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getReverse_origin_and_destination_btn().click();
        String value_origin = flightbook_tab.getOrigin_input().getAttribute("value");
        String value_dest = flightbook_tab.getDest_input().getAttribute("value");
        Assert.assertFalse(value_origin.contains("Washington") && value_dest.contains("Los Angeles"));
    }

    @Given("verify that Leaving from and Going to fields have correct placeholders")
    public void verify_that_leaving_from_and_going_to_fields_have_correct_placeholders() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        String origin_placeholder = flightbook_tab.getOrigin_input().getAttribute("placeholder");
        String dest_placeholder = flightbook_tab.getDest_input().getAttribute("placeholder");
        Assert.assertTrue(origin_placeholder.contains("From*") && dest_placeholder.contains("To*"));
    }

    @Then("click cross icon and verify that the origin field is empty")
    public void click_cross_icon_and_verify_that_the_origin_field_is_empty() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getClean_origin_input_btn());
        flightbook_tab.getClean_origin_input_btn().click();
        Assert.assertTrue(flightbook_tab.getOrigin_input().getText().isEmpty());
    }

    @Then("click cross icon and verify that the going to field is empty")
    public void click_cross_icon_and_verify_that_the_going_to_field_is_empty() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getClean_dest_input_btn());
        flightbook_tab.getClean_dest_input_btn().click();
        Assert.assertTrue(flightbook_tab.getDest_input().getText().isEmpty());
    }

    @Given("click each flight classes then verify that is selected")
    public void click_each_flight_classes_then_verify_that_is_selected() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        for (WebElement i : flightbook_tab.getCabin_types()) {
            flightbook_tab.getCabin_type_field().click();
            i.click();
            Assert.assertEquals(i.getAttribute("aria-selected"), "true");
        }
    }

    @Given("home page is loaded then click Advanced search link")
    public void home_page_is_loaded_then_click_advanced_search_link() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getAdvanced_search_link().click();
    }

    @Given("verify that the Advanced search page is loaded successfully")
    public void verify_that_the_advanced_search_page_is_loaded_successfully() {
        String currentUrl = driver.getCurrentUrl();
        String exoectedUrl = "https://www.united.com/en/us/book-flight/united-reservations";
        Assert.assertEquals(currentUrl, exoectedUrl);
    }

    @Then("decrease adults travelers to min available number")
    public void decrease_adults_travelers_to_min_available_number() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        for (int i = 0; i <= 1; i++) {
            flightbook_tab.getSubstract_one_adult_btn().click();
        }
    }

    @Then("verify that the total travelers not less than one")
    public void verify_that_the_total_travelers_not_less_than_one() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        String value = flightbook_tab.getAdults_counter().getAttribute("value");
        Assert.assertEquals(value, "1");
    }

    @Then("click Flexible dates checkbox input")
    public void click_flexible_dates_checkbox_input() {
        Reservations_Page reservations_page = new Reservations_Page();
        reservations_page.getFlexible_dates_checkbox().click();
    }

    @Then("verify that the Dates field changed to month drop down list")
    public void verify_that_the_dates_field_changed_to_month_drop_down_list() {
        Reservations_Page reservations_page = new Reservations_Page();
        boolean result = reservations_page.getFlex_month_element().isDisplayed();
        Assert.assertTrue(result);
    }

    @Then("click Travel with one pet link")
    public void click_travel_with_one_pet_link() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getTravel_with_a_pet_link().click();
    }

    @Then("verify that the user can onlyt select one pet")
    public void verify_that_the_user_can_onlyt_select_one_pet() {
        Reservations_Page reservations_page = new Reservations_Page();
        int array_list_size = reservations_page.getPet_option_elements().size();
        String value = reservations_page.getPet_option_elements().get(array_list_size - 1).getAttribute("value");
        Assert.assertEquals(value, "1");
    }


}
