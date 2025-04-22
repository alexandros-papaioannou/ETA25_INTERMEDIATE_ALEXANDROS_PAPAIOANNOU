package com.demoqa.base;

import com.demoqa.utils.ConfigReader;
import com.demoqa.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.get(ConfigReader.getProperty("baseURL"));
    }

//    @AfterMethod
//    public void tearDown() {
//        WebDriverManager.closeDriver();
//    }
}
