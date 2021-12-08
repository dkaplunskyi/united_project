package com.united.page_elements;

import com.united.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Top_Header_section {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/ul/li[1]/div/div/button")
    private WebElement language_btn;

    public WebElement getLanguage_btn() {
        return language_btn;
    }

    public Top_Header_section() {
        PageFactory.initElements(Hooks.driver, this);
    }
}
