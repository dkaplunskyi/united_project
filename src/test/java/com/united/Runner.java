package com.united;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
        features = {"src/test/resources/features"},
        glue = {"com/united"},
        tags = ""
)

public class Runner extends AbstractTestNGCucumberTests {
}
