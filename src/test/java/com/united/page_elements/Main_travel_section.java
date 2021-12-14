package com.united.page_elements;

import com.united.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Main_travel_section {


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/div/div/div[1]/div/main/section/div/div/div[1]/div/div/div[2]/ul/li")
    private List<WebElement> tabs_elements;

    @FindBy(css = "#statusTab")
    private WebElement flight_status_tab;

    @FindBy(css = "#checkInTab")
    private WebElement checkIn_tab;

    @FindBy(css = "#tripsTab")
    private WebElement tripsTab;

    public WebElement getTripsTab() {
        return tripsTab;
    }

    public WebElement getCheckIn_tab() {
        return checkIn_tab;
    }

    public List<WebElement> getTabs_elements() {
        return tabs_elements;
    }

    public WebElement getFlight_status_tab() {
        return flight_status_tab;
    }



    public Main_travel_section() {
        PageFactory.initElements(Hooks.driver, this);
    }
}
