package com.united.utility;

import com.united.base.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {

    public static void waitUntilVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
