package com.united.steps;

import com.united.page_elements.*;
import com.united.page_elements.travel_panel_elements.Flights_Status_tab;
import com.united.page_elements.travel_panel_elements.My_trip_tab;
import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import com.united.pages.Home_Page;
import com.united.utility.Common;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Sanity_Tests {


    @When("page is loaded click English on top header")
    public void page_is_loaded_click_english_on_top_header() {
        Top_Header_section top_header_section = new Top_Header_section();
        Common.waitUntilVisibility(top_header_section.getLanguage_btn());
        top_header_section.getLanguage_btn().click();
    }

    @Then("click Select Language")
    public void click_select_language() {
        Language_window language_window = new Language_window();
        Common.waitUntilVisibility(language_window.getLanguage_list_element());
        language_window.getLanguage_list_element().click();
    }

    @Then("select Deutsch")
    public void select_deutsch() {
        Language_window language_window = new Language_window();
        Common.waitUntilVisibility(language_window.getDeutsch());
        language_window.getDeutsch().click();
    }

    @Then("click Ändern button")
    public void click_ändern_button() {
        Language_window language_window = new Language_window();
        Common.waitUntilVisibility(language_window.getChange_language_btn());
        language_window.getChange_language_btn().click();
    }

    @Then("verify that the language change to Deutsch")
    public void verify_that_the_language_change_to_deutsch()  {
        Top_Header_section top_header_section = new Top_Header_section();
        Common.waitUntilVisibility(top_header_section.getLanguage_btn());
        String text = top_header_section.getLanguage_btn().getText();
        System.out.println("result: " + text);
        Assert.assertTrue(text.contains("Deutsch"));
    }


    @Then("find all links and veify each link has href attribute")
    public void find_all_links_and_veify_each_link_has_href_attribute() {
        Footer_section footer_section = new Footer_section();
        for (WebElement i : footer_section.getFooter_links()) {
            Assert.assertFalse(i.getAttribute("href").isEmpty());
        }
        System.out.println("Total links in footer: " + footer_section.getFooter_links().size());
    }

    @Then("varify that the each tab has area-selected attribute true")
    public void varify_that_the_each_tab_has_area_selected_attribute_true() {
        Main_travel_section main_travel_section = new Main_travel_section();
        for (WebElement i : main_travel_section.getTabs_elements()) {
            i.click();
            System.out.println(i.getAttribute("aria-selected"));
            Assert.assertEquals(i.getAttribute("aria-selected"), "true");
        }
    }

    @Given("user is on home page")
    public void user_is_on_home_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.united.com/en/us");
    }

    @Given("Book tab should have all necessary fields")
    public void book_tab_should_have_all_necessary_fields() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        boolean result = flightbook_tab.fieldsPresent();
        Assert.assertTrue(result);
    }

    @Given("Flight status tab should have necessary fields")
    public void flight_status_tab_should_have_necessary_fields() {
        Main_travel_section main_travel_section = new Main_travel_section();
        Flights_Status_tab flights_status_tab = new Flights_Status_tab();
        main_travel_section.getFlight_status_tab().click();
        boolean result = flights_status_tab.fieldsPresent();
        Assert.assertTrue(result);
    }
    @Given("Check-in tab should have necessary fields")
    public void check_in_tab_should_have_necessary_fields() {
        Main_travel_section main_travel_section = new Main_travel_section();
        main_travel_section.getCheckIn_tab().click();
    }
    @Given("My trips tab should have necessary fields")
    public void my_trips_tab_should_have_necessary_fields() {
        Main_travel_section main_travel_section = new Main_travel_section();
        My_trip_tab my_trip_tab = new My_trip_tab();
        main_travel_section.getTripsTab().click();
        boolean result = my_trip_tab.fieldsPresent();
        Assert.assertTrue(result);
    }

    @Then("verify that the info display has link")
    public void verify_that_the_info_display_has_link() {
        Home_Page home_page = new Home_Page();
        for (WebElement i : home_page.getAdvisory_links()) {
            Assert.assertFalse(i.getAttribute("href").isEmpty());
        }
    }

    @Then("varify that the each tab active after click")
    public void varify_that_the_each_tab_active_after_click() throws InterruptedException {
        Home_Page home_page = new Home_Page();
        for (WebElement i : home_page.getHeader_nav_links()) {
            Thread.sleep(500);
            i.click();
            Thread.sleep(500);
            String attribute = i.getAttribute("aria-selected");
            Assert.assertEquals(attribute, "true");
        }
    }


}
