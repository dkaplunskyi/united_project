package com.united.steps.regression;

import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import com.united.page_elements.travel_panel_elements.book_tab.Hotel_subtab;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hooks.driver;

public class Hotel_book_steps {

    @When("home page loaded click Hotel subtab in Book tab")
    public void home_page_loaded_click_hotel_subtab_in_book_tab() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getHotel_subtab_btn().click();
    }

    @Then("verify that the fields are present")
    public void verify_that_the_fields_are_present() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        boolean result = hotel__subtab.fieldsPresent();
        Assert.assertTrue(result);
    }

    @Then("verify that the one room and one travelers selected")
    public void verify_that_the_one_room_and_one_travelers_selected() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        WebElement zero_index_element = hotel__subtab.getRooms_dropdown_elements().get(0);
        String attribute = zero_index_element.getAttribute("aria-selected");
        Assert.assertEquals(attribute, "true");
    }

    @Then("click Number of travelers text field")
    public void click_number_of_travelers_text_field() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        hotel__subtab.getNumber_of_travelers_input().click();
    }


    @Then("click more than eighth times on plus sign for Adults and Children")
    public void click_more_than_eighth_times_on_plus_sign_for_adults_and_children() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        for (int i = 0; i <= 10; i++) {
            for (WebElement j : hotel__subtab.getPlus_trevelers_signs()) {
                j.click();
            }
        }
    }

    @Then("verify that the total travelers not more than sixteen")
    public void verify_that_the_total_travelers_not_more_than_sixteen() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        String value = hotel__subtab.getNumber_of_travelers_input().getAttribute("value");
        Assert.assertTrue(value.contains("16"));
    }

    @Then("click Number of rooms field and select last one available option")
    public void click_number_of_rooms_field_and_select_last_one_available_option() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        hotel__subtab.getRooms_dropdown().click();
        int size = hotel__subtab.getRooms_dropdown_elements().size();
        hotel__subtab.getRooms_dropdown_elements().get(size - 1).click();
    }

    @Then("verify that the maximum available rooms is eighth")
    public void verify_that_the_maximum_available_rooms_is_eighth() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        int size = hotel__subtab.getRooms_dropdown_elements().size();
        String attribute = hotel__subtab.getRooms_dropdown_elements().get(size - 1).getAttribute("aria-selected");
        Assert.assertEquals(attribute, "true");
    }

    @Then("verify that the Number of travelers field is disappear")
    public void verify_that_the_number_of_travelers_field_is_disappear() throws InterruptedException {
        Thread.sleep(2000);
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        String attribute = hotel__subtab.getNumber_of_travelers_visiblr_element().getAttribute("aria-hidden");
        Assert.assertEquals(attribute, "true");
    }

    @Then("fill out Going to and Dates and click Find hotels button")
    public void fill_out_going_to_and_dates_and_click_find_hotels_button() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        hotel__subtab.fill_out_fields_and_dates("Miami", 30, 2);
        hotel__subtab.getHotel_buttons().get(2).click();
    }

    @Then("verify that the new page loaded successfully with hotels result")
    public void verify_that_the_new_page_loaded_successfully_with_hotels_result() {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(hotel__subtab.getSearch_resul_list().size() > 0);
    }

}
