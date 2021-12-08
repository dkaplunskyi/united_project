package com.united.page_elements;

import com.united.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Footer_section {

    @FindBy(css = "footer>div a")
    private List<WebElement> footer_links;

    public List<WebElement> getFooter_links() {
        return footer_links;
    }

    public Footer_section() {
        PageFactory.initElements(Hooks.driver, this);
    }
}
