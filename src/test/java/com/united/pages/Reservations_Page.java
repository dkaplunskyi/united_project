package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Reservations_Page {


    @FindBy(css = "input[name=\"Flexible\"]")
    private WebElement flexible_dates_checkbox;

    @FindBy(css = "select[aria-describedby=\"Select Month\"]")
    private WebElement flex_month_element;

    @FindBy(css = "select[name=\"bookFlightModel.advancedSearch.petCabin\"]>option")
    private List<WebElement> pet_option_elements;

    @FindBy(xpath = "//*[@id=\"dpApibfg2So\"]/fieldset/div[2]/div[1]/div/div/div/select")
    private WebElement select_number_of_pet;

    public WebElement getSelect_number_of_pet() {
        return select_number_of_pet;
    }

    public List<WebElement> getPet_option_elements() {
        return pet_option_elements;
    }

    public WebElement getFlex_month_element() {
        return flex_month_element;
    }

    public WebElement getFlexible_dates_checkbox() {
        return flexible_dates_checkbox;
    }

    public Reservations_Page() {
        PageFactory.initElements(driver, this);
    }
}
