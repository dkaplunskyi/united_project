package com.united.page_elements.travel_panel_elements;

import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class My_trip_tab {

    @FindBy(css = "a[aria-label=\"Find your travel credits\"]")
    private WebElement travel_credits_link;

    @FindBy(css = "a[aria-label=\"Looking for past or canceled flights?\"]")
    private WebElement sign_in_link;

    @FindBy(css = "#myTripsConfirmationNumber_aria")
    private WebElement confirmationNumber_elementl;

    @FindBy(css = "#myTripsLastName_aria")
    private WebElement lastName_aria_elementl;

    @FindBy(css = "#tripsTab")
    private WebElement tripsTab_btn;

    @FindBy(css = "#myTripsSubmitBtn")
    private WebElement search_btn;

    @FindBy(css = "#myTripsConfirmationNumber")
    private WebElement myTripsConfirmationNumber_input;

    @FindBy(css = "#myTripsLastName")
    private WebElement myTripsLastName_input;

    public WebElement getSearch_btn() {
        return search_btn;
    }

    public WebElement getTripsTab_btn() {
        return tripsTab_btn;
    }

    public WebElement getTravel_credits_link() {
        return travel_credits_link;
    }

    public WebElement getSign_in_link() {
        return sign_in_link;
    }

    public WebElement getConfirmationNumber_elementl() {
        return confirmationNumber_elementl;
    }

    public WebElement getLastName_aria_elementl() {
        return lastName_aria_elementl;
    }

    public boolean fieldsPresent() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        // check if a certain field is displayed / present
        return myTripsConfirmationNumber_input.isDisplayed() &&
                myTripsLastName_input.isDisplayed() &&
                search_btn.isDisplayed() &&
                travel_credits_link.isDisplayed();
    }

    public My_trip_tab() {
        PageFactory.initElements(driver, this);
    }
}
