package com.united.page_elements.travel_panel_elements.book_tab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Package_subtab {


    @FindBy(css = "#vacationOriginInput")
    private WebElement origin_input;

    @FindBy(css = "#vacationDestinationInput")
    private WebElement destination_input;

    @FindBy(css = "#DepartDate")
    private WebElement depart_date_input;

    @FindBy(css = "#ReturnDate")
    private WebElement return_date_input;

    @FindBy(css = "#bookVacationForm button[type='submit']")
    private WebElement find_trips_btn;

    @FindBy(css = "#vacationOriginInput-menu li")
    private List<WebElement> originInput_menu_li_list;

    @FindBy(css = "#vacationDestinationInput-menu li")
    private List<WebElement> destinationInput_menu_li_list;

    @FindBy(css = "td[aria-label~='December']")
    private List<WebElement> december_days;

    @FindBy(css = "td[aria-label~='January']")
    private List<WebElement> january_days;

    @FindBy(css = "#listingContent div[data-testid='NEW_HOTEL_LISTING']")
    private List<WebElement> package_search_result;

    @FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[2]/div[3]/div/div/div/div/ul/li")
    private List<WebElement> rooms_list;

    @FindBy(css = "#selectedRooms")
    private WebElement selectedRooms_btn;

    @FindBy(css = "#radiofield-item-id-packageType-2")
    private WebElement flight_car_radiobutton;

    @FindBy(css = "#bookCruiseTab")
    private WebElement cruise_link;

    public WebElement getCruise_link() {
        return cruise_link;
    }

    public WebElement getFlight_car_radiobutton() {
        return flight_car_radiobutton;
    }

    public WebElement getSelectedRooms_btn() {
        return selectedRooms_btn;
    }

    public List<WebElement> getRooms_list() {
        return rooms_list;
    }

    public List<WebElement> getPackage_search_result() {
        return package_search_result;
    }

    public List<WebElement> getDecember_days() {
        return december_days;
    }

    public List<WebElement> getJanuary_days() {
        return january_days;
    }

    public List<WebElement> getDestinationInput_menu_li_list() {
        return destinationInput_menu_li_list;
    }

    public List<WebElement> getOriginInput_menu_li_list() {
        return originInput_menu_li_list;
    }

    public WebElement getOrigin_input() {
        return origin_input;
    }

    public WebElement getDestination_input() {
        return destination_input;
    }

    public WebElement getDepart_date_input() {
        return depart_date_input;
    }

    public WebElement getReturn_date_input() {
        return return_date_input;
    }

    public WebElement getFind_trips_btn() {
        return find_trips_btn;
    }

    public void fillout_fields(String From, String To, int december_day_departure, int january_day_return) {
        origin_input.clear();
        origin_input.sendKeys(From);
        originInput_menu_li_list.get(0).click();
        destination_input.clear();
        destination_input.sendKeys(To);
        destinationInput_menu_li_list.get(0).click();
        depart_date_input.click();
        december_days.get(december_day_departure - 1).click();
        return_date_input.click();
        january_days.get(january_day_return - 1).click();
        find_trips_btn.click();
    }

    public Package_subtab() {
        PageFactory.initElements(driver, this);
    }
}
