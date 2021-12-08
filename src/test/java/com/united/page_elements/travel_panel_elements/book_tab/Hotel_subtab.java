package com.united.page_elements.travel_panel_elements.book_tab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Hotel_subtab {

    @FindBy(css = "#bookHotelTab-panel input")
    private List<WebElement> hotel_inputs;

    @FindBy(css = "#bookHotelTab-panel button")
    private List<WebElement> hotel_buttons;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[2]/div[1]/div/div/ul/li")
    private List<WebElement> rooms_dropdown_elements;

    @FindBy(css = "#Adults")
    private WebElement adults_counter;

    @FindBy(xpath = "//button[text()='+']")
    private List<WebElement> plus_trevelers_signs;

    @FindBy(css = "input[placeholder=\"Number of travelers*\"]")
    private WebElement number_of_travelers_input;

    @FindBy(css = "#roomsDropdown")
    private WebElement rooms_dropdown;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[2]/div[2]")
    private WebElement number_of_travelers_visiblr_element;

    @FindBy(css = "#bookHotelInput-menu li")
    private List<WebElement> book_hotel_list;

    @FindBy(css = "td[aria-label~='December']")
    private List<WebElement> december_days;

    @FindBy(css = "td[aria-label~='January']")
    private List<WebElement> january_days;

    @FindBy(css = "#listings>ol>li")
    private List<WebElement> search_resul_list;

    public List<WebElement> getSearch_resul_list() {
        return search_resul_list;
    }

    public List<WebElement> getJanuary_days() {
        return january_days;
    }

    public List<WebElement> getDecember_days() {
        return december_days;
    }

    public List<WebElement> getBook_hotel_list() {
        return book_hotel_list;
    }

    public WebElement getNumber_of_travelers_visiblr_element() {
        return number_of_travelers_visiblr_element;
    }

    public WebElement getRooms_dropdown() {
        return rooms_dropdown;
    }

    public List<WebElement> getPlus_trevelers_signs() {
        return plus_trevelers_signs;
    }

    public WebElement getNumber_of_travelers_input() {
        return number_of_travelers_input;
    }

    public WebElement getAdults_counter() {
        return adults_counter;
    }

    public List<WebElement> getRooms_dropdown_elements() {
        return rooms_dropdown_elements;
    }

    public List<WebElement> getHotel_inputs() {
        return hotel_inputs;
    }

    public List<WebElement> getHotel_buttons() {
        return hotel_buttons;
    }

    public boolean fieldsPresent() {
        // check if a certain field is displayed / present
        for (WebElement i : hotel_inputs) {
            if (i.isDisplayed()) {
                return true;
            }
        }
        for (WebElement i : hotel_buttons) {
            if (i.isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    public void fill_out_fields_and_dates(String Going_to, int december_checkin_date, int january_checkout_date){
        getHotel_inputs().get(0).clear();
        getHotel_inputs().get(0).sendKeys(Going_to);
        getBook_hotel_list().get(0).click();
        getHotel_inputs().get(1).click();
        getDecember_days().get(december_checkin_date - 1).click();
        getHotel_inputs().get(2).click();
        getJanuary_days().get(january_checkout_date - 1).click();
    }

    public Hotel_subtab() {
        PageFactory.initElements(driver, this);
    }
}
