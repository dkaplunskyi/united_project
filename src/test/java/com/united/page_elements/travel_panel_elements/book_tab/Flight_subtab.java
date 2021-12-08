package com.united.page_elements.travel_panel_elements.book_tab;

import com.united.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Flight_subtab {

    @FindBy(css = "#bookFlightOriginInput")
    private WebElement origin_input;

    @FindBy(css = "#bookFlightDestinationInput")
    private WebElement dest_input;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[1]/div/button[2]")
    private WebElement clean_origin_input_btn;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[2]/div/button[2]")
    private WebElement clean_dest_input_btn;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[5]/div/div[1]/div/div/button")
    private WebElement find_flights_btn;

    @FindBy(xpath = "//*[@id=\"flightResults-content\"]/div[2]/div")
    private List<WebElement> result_of_search;

    @FindBy(xpath = "//*[@id=\"autocomplete-item-0\"]/button")
    private WebElement airport_element;

    @FindBy(css = "#oneway")
    private WebElement oneway_radio_btn;

    @FindBy(css = "#roundtrip")
    private WebElement roundtrip_radio_btn;

    @FindBy(css = "#DepartDate")
    private WebElement dates_field_element;

    @FindBy(xpath = "//*[@id=\"passengerSelector\"]/button")
    private WebElement travelers_field_element;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[1]/div/input")
    private WebElement adults_counter;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[3]/div/input")
    private WebElement infant_counter;

    @FindBy(css = "button[aria-label=\"Move backward to switch to the previous month.\"]")
    private WebElement previous_btn;

    @FindBy(xpath = "(//td[text()=15])[2]")
    private WebElement jan_15_date;

    @FindBy(xpath = "(//td[text()=15])[2]")
    private WebElement feb_15_date;

    @FindBy(xpath = "(//td[text()=22])[2]")
    private WebElement feb_22_date;

    @FindBy(css = "#DepartDate")
    private WebElement departDate_field;

    @FindBy(css = "#ReturnDate")
    private WebElement returnDate_field;

    @FindBy(css = "#bookFlightTab-panel input")
    private List<WebElement> all_inputs_in_book_tab;

    @FindBy(css = "button[aria-label=\"Substract one Adult\"]")
    private WebElement add_one_adult_btn;

    @FindBy(css = "button[aria-label=\"Add one more Adult\"]")
    private WebElement substract_one_adult_btn;

    @FindBy (css = "#passengerMenuId input")
    private List<WebElement> travelers_counter_inputs;

    @FindBy (css = "button[aria-label=\"reverse origin and destination\"]")
    private WebElement reverse_origin_and_destination_btn;

    @FindBy (xpath = "//*[@id=\"bookFlightForm\"]/div[4]/div[1]/div/div/ul/li")
    private List<WebElement> cabin_types;

    @FindBy(css = "#cabinType")
    private WebElement cabin_type_field;

    @FindBy(css = "button[title=\"Advanced search\"]")
    private WebElement advanced_search_link;

    @FindBy(xpath = "//span[text()='Travel with a pet']")
    private WebElement travel_with_a_pet_link;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]//button[text()='+']")
    private List<WebElement> plus_sighs;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]//button[text()='-']")
    private List<WebElement> minus_sighs;

    @FindBy(css = "#bookHotelTab")
    private WebElement hotel_subtab_btn;

    @FindBy(css = "#bookCarTab")
    private WebElement car_subtab_btn;

    @FindBy(css = "#bookPackageTab")
    private WebElement package_subtab_btn;

    @FindBy(css = "#passengerMenuId button[aria-label=\"Close Panel\"]")
    private WebElement close_dates_panel_btn;

    public WebElement getClose_dates_panel_btn() {
        return close_dates_panel_btn;
    }

    public WebElement getPackage_subtab_btn() {
        return package_subtab_btn;
    }

    public WebElement getCar_subtab_btn() {
        return car_subtab_btn;
    }

    public WebElement getHotel_subtab_btn() {
        return hotel_subtab_btn;
    }

    public List<WebElement> getPlus_sighs() {
        return plus_sighs;
    }

    public List<WebElement> getMinus_sighs() {
        return minus_sighs;
    }

    public WebElement getTravel_with_a_pet_link() {
        return travel_with_a_pet_link;
    }

    public WebElement getSubstract_one_adult_btn() {
        return substract_one_adult_btn;
    }

    public WebElement getAdvanced_search_link() {
        return advanced_search_link;
    }

    public WebElement getCabin_type_field() {
        return cabin_type_field;
    }

    public List<WebElement> getCabin_types() {
        return cabin_types;
    }

    public WebElement getReverse_origin_and_destination_btn() {
        return reverse_origin_and_destination_btn;
    }

    public List<WebElement> getTravelers_counter_inputs() {
        return travelers_counter_inputs;
    }

    public WebElement getAdd_one_adult_btn() {
        return add_one_adult_btn;
    }

    public List<WebElement> getAll_inputs_in_book_tab() {
        return all_inputs_in_book_tab;
    }

    public WebElement getFeb_15_date() {
        return feb_15_date;
    }

    public WebElement getFeb_22_date() {
        return feb_22_date;
    }

    public WebElement getDepartDate_field() {
        return departDate_field;
    }

    public WebElement getReturnDate_field() {
        return returnDate_field;
    }

    public WebElement getJan_15_date() {
        return jan_15_date;
    }

    public WebElement getPrevious_btn() {
        return previous_btn;
    }

    public WebElement getAdults_counter() {
        return adults_counter;
    }

    public WebElement getInfant_counter() {
        return infant_counter;
    }

    public WebElement getTravelers_field_element() {
        return travelers_field_element;
    }

    public WebElement getRoundtrip_radio_btn() {
        return roundtrip_radio_btn;
    }

    public WebElement getDates_field_element() {
        return dates_field_element;
    }

    public WebElement getOneway_radio_btn() {
        return oneway_radio_btn;
    }

    public WebElement getAirport_element() {
        return airport_element;
    }

    public List<WebElement> getResult_of_search() {
        return result_of_search;
    }

    public WebElement getClean_origin_input_btn() {
        return clean_origin_input_btn;
    }

    public WebElement getClean_dest_input_btn() {
        return clean_dest_input_btn;
    }

    public WebElement getFind_flights_btn() {
        return find_flights_btn;
    }

    public WebElement getOrigin_input() {
        return origin_input;
    }

    public WebElement getDest_input() {
        return dest_input;
    }

    public boolean fieldsPresent() {
        // check if a certain field is displayed / present
        for (WebElement i : all_inputs_in_book_tab) {
            if (i.isDisplayed() && find_flights_btn.isDisplayed() && cabin_type_field.isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    public Flight_subtab() {
        PageFactory.initElements(Hooks.driver, this);
    }
}
