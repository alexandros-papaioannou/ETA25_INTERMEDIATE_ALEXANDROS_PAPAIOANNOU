package com.demoqa.base;

import com.demoqa.utils.ConfigPropertiesReader;
import com.demoqa.utils.ConfigXmlReader;
import com.demoqa.utils.WebDriverManager;
import com.demoqa.utils.XmlConfig;
import com.demoqa.utils.browser.BrowserFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
//        ConfigXmlReader configXmlReader = XmlConfig.createConfigXml(ConfigXmlReader.class);
//        //driver.get(configXmlReader.driverXmlReader.url);
//        driver = WebDriverManager.getDriver();
//        Assert.assertNotNull(configXmlReader);
//        driver.get(configXmlReader.driverXmlReader.url);
//        //driver.get(ConfigPropertiesReader.getProperty("baseURL"));
//        ((JavascriptExecutor) driver).executeScript("document.querySelectorAll('iframe, .google-auto-placed, #adplus-anchor').forEach(el => el.remove());");
        driver = new BrowserFactory().getBrowserOptions();
    }

//    @AfterMethod
//    public void tearDown() {
//        WebDriverManager.closeDriver();
//    }
}
