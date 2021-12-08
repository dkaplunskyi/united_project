package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

import static com.united.base.Hooks.driver;

public class Home_Page {

    @FindBy(css = "div[aria-live=\"polite\"] span a")
    private List<WebElement> advisory_links;

    @FindBy(css = "div[role=\"tablist\"] a")
    private List<WebElement> header_nav_links;

    public List<WebElement> getHeader_nav_links() {
        return header_nav_links;
    }

    public List<WebElement> getAdvisory_links() {
        return advisory_links;
    }

    public Home_Page() {
        PageFactory.initElements(driver, this);
    }
}
