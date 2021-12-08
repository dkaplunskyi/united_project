package com.united.base;

import com.united.utility.Browser_manager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class Hooks {

    String URL = "https://www.united.com/";

    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = Browser_manager.select_browser("chrome");
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
