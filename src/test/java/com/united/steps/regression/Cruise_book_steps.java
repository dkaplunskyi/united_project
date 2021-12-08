package com.united.steps.regression;

import com.united.page_elements.travel_panel_elements.book_tab.Package_subtab;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hooks.driver;

public class Cruise_book_steps {

    @When("home page loaded click Cruise subtab in Book tab")
    public void home_page_loaded_click_cruise_subtab_in_book_tab() {
        Package_subtab package__subtab = new Package_subtab();
        package__subtab.getCruise_link().click();
    }

    @When("verify that the cruises united website is loaded successfully")
    public void verify_that_the_cruises_united_website_is_loaded_successfully() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String title = driver.getTitle();
        Assert.assertEquals(title, "United Cruises");
    }
}
