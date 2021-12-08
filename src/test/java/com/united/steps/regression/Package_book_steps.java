package com.united.steps.regression;

import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import com.united.page_elements.travel_panel_elements.book_tab.Package_subtab;
import io.cucumber.java.en.*;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hooks.driver;

public class Package_book_steps {

    @When("home page loaded click Packages subtab in Book tab")
    public void home_page_loaded_click_packages_subtab_in_book_tab() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        flightbook_tab.getPackage_subtab_btn().click();
    }

    @Then("fill out location and dates field and click Find trips button")
    public void fill_out_location_and_dates_field_and_click_find_trips_button() {
        Package_subtab package__subtab = new Package_subtab();
        package__subtab.fillout_fields("Washington", "Miami", 30, 2);
    }

    @Then("verify that the new page loaded successfully with packages results")
    public void verify_that_the_new_page_loaded_successfully_with_packages_results() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Package_subtab package__subtab = new Package_subtab();
        int size = package__subtab.getPackage_search_result().size();
        Assert.assertTrue(size > 0);
    }

    @Then("click Rooms field and select the largest available number")
    public void click_rooms_field_and_select_the_largest_available_number() {
        Package_subtab package__subtab = new Package_subtab();
        package__subtab.getSelectedRooms_btn().click();
        int last_item = package__subtab.getRooms_list().size() - 1;
        package__subtab.getRooms_list().get(last_item).click();
    }

    @Then("verify that the largest number of room is four")
    public void verify_that_the_largest_number_of_room_is_four() {
        Package_subtab package__subtab = new Package_subtab();
        String value = package__subtab.getSelectedRooms_btn().getText();
        Assert.assertEquals(value, "4 rooms");
    }

    @Then("verify that the container has rooms word")
    public void verify_that_the_container_has_rooms_word() {
        Package_subtab package__subtab = new Package_subtab();
        String value = package__subtab.getSelectedRooms_btn().getText();
        Assert.assertTrue(value.contains("rooms"));
    }

    @Then("click Flight and car radio button")
    public void click_flight_and_car_radio_button() {
        Package_subtab package__subtab = new Package_subtab();
        package__subtab.getFlight_car_radiobutton().click();
    }

    @Then("verify that the Rooms field disappear")
    public void verify_that_the_rooms_field_disappear() {
        Package_subtab package__subtab = new Package_subtab();
        boolean result = package__subtab.getSelectedRooms_btn().isDisplayed();
        Assert.assertFalse(result);
    }


}
