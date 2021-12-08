package com.united.page_elements.travel_panel_elements;

import com.united.base.Hooks;
import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_in_tab {

    @FindBy(css = "#flightCheckInConfNumber")
    private WebElement checkInConfNumber_input;

    @FindBy(css = "#flightCheckInLastName")
    private WebElement flightCheckInLastName_input;

    @FindBy(css = "#formSubmitBtn")
    private WebElement search_btn;

    @FindBy(xpath = "//*[@id=\"bookFlightCheckin\"]/div[3]/button")
    private WebElement mileagePlus_link;

    @FindBy(css = "#checkInTab")
    private WebElement checkIn_tab;

    @FindBy(css = "#flightCheckInConfNumber_aria")
    private WebElement flightCheckInConfNumber_element;

    @FindBy(css = "#flightCheckInLastName_aria")
    private WebElement flightCheckInLastName_element;

    @FindBy(css = "a[aria-label~='Check-in']")
    private WebElement check_in_details_link;

    public WebElement getMileagePlus_link() {
        return mileagePlus_link;
    }

    public WebElement getCheck_in_details_link() {
        return check_in_details_link;
    }

    public WebElement getFlightCheckInConfNumber_element() {
        return flightCheckInConfNumber_element;
    }

    public WebElement getFlightCheckInLastName_element() {
        return flightCheckInLastName_element;
    }

    public WebElement getCheckInConfNumber_input() {
        return checkInConfNumber_input;
    }

    public WebElement getFlightCheckInLastName_input() {
        return flightCheckInLastName_input;
    }

    public WebElement getSearch_btn() {
        return search_btn;
    }

    public WebElement getCheckIn_tab() {
        return checkIn_tab;
    }

    public boolean fieldsPresent() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        // check if a certain field is displayed / present
        return checkInConfNumber_input.isDisplayed() &&
                flightCheckInLastName_input.isDisplayed() &&
                search_btn.isDisplayed() &&
                mileagePlus_link.isDisplayed();
    }

    public Check_in_tab() {
        PageFactory.initElements(Hooks.driver, this);
    }
}
