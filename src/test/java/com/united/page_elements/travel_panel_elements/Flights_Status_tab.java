package com.united.page_elements.travel_panel_elements;

import com.united.base.Hooks;
import com.united.page_elements.travel_panel_elements.book_tab.Flight_subtab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Flights_Status_tab {

    @FindBy(css = "#flightStatusOriginInput")
    private WebElement origin_input;

    @FindBy(css = "#flightStatusDestinationInput")
    private WebElement destination_input;

    @FindBy(css = "#flightStatusModel input")
    private List<WebElement> inputs;

    @FindBy(xpath = "//*[@id=\"flightStatusModel\"]/div/div[7]/a")
    private WebElement flight_status_notification_link;

    @FindBy(css = "#statusTab")
    private WebElement flight_status_btn;

    @FindBy(css = "#flightStatusOriginInput-menu li")
    private List<WebElement> originInput_menu_li_list;

    @FindBy(css = "#flightStatusDestinationInput-menu li")
    private List<WebElement> destinationInput_menu_li_list;

    @FindBy(css = "#flightStatusModel button[type='submit']")
    private WebElement search_btn;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[4]/div/section/div/div[2]/div[2]/div")
    private List<WebElement> search_result_list;

    @FindBy(xpath = "//div[text()='Please enter a valid flight number.']")
    private WebElement message_input_element;

    @FindBy(xpath = "//p[text()='The number you entered is not a valid flight number.']")
    private WebElement message_page_element;

    public WebElement getMessage_page_element() {
        return message_page_element;
    }

    public WebElement getMessage_input_element() {
        return message_input_element;
    }

    public List<WebElement> getSearch_result_list() {
        return search_result_list;
    }

    public List<WebElement> getOriginInput_menu_li_list() {
        return originInput_menu_li_list;
    }

    public List<WebElement> getDestinationInput_menu_li_list() {
        return destinationInput_menu_li_list;
    }

    public WebElement getFlight_status_btn() {
        return flight_status_btn;
    }

    public WebElement getFlight_status_notification_link() {
        return flight_status_notification_link;
    }

    public List<WebElement> getInputs() {
        return inputs;
    }

    public WebElement getSearch_btn() {
        return search_btn;
    }

    public WebElement getOrigin_input() {
        return origin_input;
    }

    public WebElement getDestination_input() {
        return destination_input;
    }

    public boolean fieldsPresent() {
        Flight_subtab flightbook_tab = new Flight_subtab();
        // check if a certain field is displayed / present
        for (WebElement i : inputs) {
            if (i.isDisplayed() && search_btn.isDisplayed() && flight_status_notification_link.isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    public void fillout_form(){
        origin_input.sendKeys("Washington");
        originInput_menu_li_list.get(0).click();

        destination_input.sendKeys("Miami");
        destinationInput_menu_li_list.get(0).click();

        search_btn.click();
    }

    public Flights_Status_tab() {
        PageFactory.initElements(Hooks.driver, this);
    }
}
