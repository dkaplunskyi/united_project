package com.united.page_elements.travel_panel_elements.book_tab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Car_subtab {

    @FindBy(css = "#bookCarTab-panel button")
    private List<WebElement> buttons;

    @FindBy(css = "#bookCarTab-panel input")
    private List<WebElement> inputs;

    @FindBy(css = "#bookCarPickupInput-menu li")
    private List<WebElement> book_car_list;

    @FindBy(css = "#ct-availability-list>div")
    private List<WebElement> search_resul_list;

    @FindBy(xpath = "//span//span[text()='miles']")
    private List<WebElement> search_miles_resul_list;

    @FindBy(css = "#hideAgeBox")
    private WebElement age_checkbox;

    @FindBy(css = "#showDropOffLocation")
    private WebElement same_location_checkbox;

    @FindBy(css = "#driversAge")
    private WebElement drivers_age_input;

    @FindBy(css = "#ct-availability-list-no-result p")
    private List<WebElement> search_result_driver_messages;

    public List<WebElement> getSearch_result_driver_messages() {
        return search_result_driver_messages;
    }

    public WebElement getDrivers_age_input() {
        return drivers_age_input;
    }

    public WebElement getAge_checkbox() {
        return age_checkbox;
    }

    public WebElement getSame_location_checkbox() {
        return same_location_checkbox;
    }

    public List<WebElement> getSearch_miles_resul_list() {
        return search_miles_resul_list;
    }

    public List<WebElement> getSearch_resul_list() {
        return search_resul_list;
    }

    public List<WebElement> getBook_car_list() {
        return book_car_list;
    }

    public List<WebElement> getButtons() {
        return buttons;
    }

    public List<WebElement> getInputs() {
        return inputs;
    }

    public boolean fields_and_buttons_present() {
        for (WebElement i : inputs) {
            i.isDisplayed();
            return true;
        }
        for (WebElement i : buttons) {
            i.isDisplayed();
            return true;
        }
        return false;
    }

    public void fill_out_fields_and_dates(String Going_to, int december_checkin_date, int january_checkout_date) {
        Hotel_subtab hotel__subtab = new Hotel_subtab();
        inputs.get(0).clear();
        inputs.get(0).sendKeys(Going_to);
        book_car_list.get(0).click();
        inputs.get(2).click();
        hotel__subtab.getDecember_days().get(december_checkin_date - 1).click();
        inputs.get(3).click();
        hotel__subtab.getJanuary_days().get(january_checkout_date - 1).click();
    }

    public Car_subtab() {
        PageFactory.initElements(driver, this);
    }
}
