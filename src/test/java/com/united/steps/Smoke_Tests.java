package com.united.steps;

import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import com.united.page_elements.Main_travel_section;
import com.united.utility.Common;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class Smoke_Tests {
    @When("page is loaded verify following tabs are present")
    public void page_is_loaded_verify_following_tabs_are_present() {
        Main_travel_section main_travel_section = new Main_travel_section();
        int size = main_travel_section.getTabs_elements().size();
        Assert.assertEquals(size, 4);
    }

    @When("fill out Origin text field")
    public void fill_out_From_text_field() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getOrigin_input());
        flightbook_tab.getOrigin_input().click();
        Common.waitUntilVisibility(flightbook_tab.getClean_origin_input_btn());
        flightbook_tab.getClean_origin_input_btn().click();
        Common.waitUntilVisibility(flightbook_tab.getOrigin_input());
        flightbook_tab.getOrigin_input().clear();
        flightbook_tab.getOrigin_input().sendKeys("Washington");
        Common.waitUntilVisibility(flightbook_tab.getAirport_element());
        flightbook_tab.getAirport_element().click();
    }

    @Then("fill out Destination text field")
    public void fill_out_To_text_field() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getDest_input());
        flightbook_tab.getDest_input().click();
        Common.waitUntilVisibility(flightbook_tab.getDest_input());
        flightbook_tab.getDest_input().clear();
        flightbook_tab.getDest_input().sendKeys("Los Angeles");
        Common.waitUntilVisibility(flightbook_tab.getAirport_element());
        flightbook_tab.getAirport_element().click();
    }

    @And("click Search button")
    public void click_search_button() {
        Flight_subtab flight_subtab = new Flight_subtab();
        Common.waitUntilVisibility(flight_subtab.getFind_flights_btn());
        flight_subtab.getFind_flights_btn().click();
    }

    @Then("verify that the flights info are displayed")
    public void verify_that_the_flights_info_are_displayed() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        int size = flightbook_tab.getResult_of_search().size();
        Assert.assertTrue(size > 0);
    }

    @Given("select One-way radio button")
    public void select_one_way_radio_button() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getOneway_radio_btn().click();
    }

    @Then("choose Jan 15 date")
    public void choose_Jan_15_date() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getDates_field_element());
        flightbook_tab.getDates_field_element().click();
        Common.waitUntilVisibility(flightbook_tab.getPrevious_btn());
        flightbook_tab.getPrevious_btn().click();
        Common.waitUntilVisibility(flightbook_tab.getJan_15_date());
        flightbook_tab.getJan_15_date().click();
        Common.waitUntilVisibility(flightbook_tab.getDates_field_element());
        String departureDate = flightbook_tab.getDates_field_element().getAttribute("value");
        Assert.assertTrue(departureDate.contains("Jan 15"));
    }

    @Given("select Roundtrip radio button")
    public void select_roundtrip_radio_button() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getRoundtrip_radio_btn().click();
    }

    @Then("choose departure and return date")
    public void choose_departure_and_return_date() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getDates_field_element());
        flightbook_tab.getDepartDate_field().click();
        Common.waitUntilVisibility(flightbook_tab.getFeb_15_date());
        flightbook_tab.getFeb_15_date().click();
        Common.waitUntilVisibility(flightbook_tab.getFeb_22_date());
        flightbook_tab.getFeb_22_date().click();
        String departureDate = flightbook_tab.getDepartDate_field().getAttribute("value");
        String returnDate = flightbook_tab.getReturnDate_field().getAttribute("value");
        Assert.assertTrue(departureDate.contains("Feb 15") && returnDate.contains("Feb 22"));
    }

    @Then("add two adults and one infant passenger")
    public void add_two_adults_and_one_infant_passenger() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        Common.waitUntilVisibility(flightbook_tab.getTravelers_field_element());
        flightbook_tab.getTravelers_field_element().click();
        Common.waitUntilVisibility(flightbook_tab.getAdults_counter());
        flightbook_tab.getAdults_counter().sendKeys("2");
        Common.waitUntilVisibility(flightbook_tab.getInfant_counter());
        flightbook_tab.getInfant_counter().sendKeys("1");
        flightbook_tab.getClose_dates_panel_btn().click();
    }

}
