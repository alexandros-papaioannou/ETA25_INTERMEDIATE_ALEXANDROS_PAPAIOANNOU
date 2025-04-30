package com.demoqa.base;

import com.demoqa.utils.ConfigReader;
import com.demoqa.utils.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.get(ConfigReader.getProperty("baseURL"));
        ((JavascriptExecutor) driver).executeScript("document.querySelectorAll('iframe, .google-auto-placed, #adplus-anchor').forEach(el => el.remove());");
    }

//    @AfterMethod
//    public void tearDown() {
//        WebDriverManager.closeDriver();
//    }
}
