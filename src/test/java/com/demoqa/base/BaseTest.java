package com.demoqa.base;

import utils.logger.LoggerUtility;
import utils.WebDriverManager;
import utils.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;


    public void setUp() {
//        ConfigXmlReader configXmlReader = XmlConfig.createConfigXml(ConfigXmlReader.class);
//        //driver.get(configXmlReader.driverXmlReader.url);
//        driver = WebDriverManager.getDriver();
//        Assert.assertNotNull(configXmlReader);
//        driver.get(configXmlReader.driverXmlReader.url);
//        //driver.get(ConfigPropertiesReader.getProperty("baseURL"));
//        ((JavascriptExecutor) driver).executeScript("document.querySelectorAll('iframe, .google-auto-placed, #adplus-anchor').forEach(el => el.remove());");
        driver = new BrowserFactory().getBrowserOptions();
        LoggerUtility.infoLog("###### The browser was opened successfully ######");
    }


    public void tearDown() {
        WebDriverManager.closeDriver();
        LoggerUtility.infoLog("###### The browser was closed successfully ######");
    }
}
