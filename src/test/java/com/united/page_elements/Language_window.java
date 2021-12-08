package com.united.page_elements;

import com.united.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Language_window {

    @FindBy(xpath = "//*[@id=\"localization-language-selector\"]")
    private WebElement language_list_element;

    @FindBy(css = "#localization-language-selector_item-0")
    private WebElement deutsch;

    @FindBy(xpath = "//*[@id=\"localization-content-wrapper\"]/div[3]/button")
    private WebElement change_language_btn;

    public WebElement getLanguage_list_element() {
        return language_list_element;
    }

    public WebElement getDeutsch() {
        return deutsch;
    }

    public WebElement getChange_language_btn() {
        return change_language_btn;
    }

    public Language_window() {
        PageFactory.initElements(Hooks.driver, this);
    }
}
