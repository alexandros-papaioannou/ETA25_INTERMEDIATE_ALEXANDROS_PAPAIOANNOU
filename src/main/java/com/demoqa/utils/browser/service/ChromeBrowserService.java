package com.demoqa.utils.browser.service;

import com.demoqa.utils.DriverXmlReader;
import com.demoqa.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeBrowserService implements BrowserService {

    private WebDriver driver;

    @Override
    public void openBrowser(DriverXmlReader driverXmlReader) {
        ChromeOptions chromeOptions = (ChromeOptions) getBrowserOptions(driverXmlReader);
        driver = new ChromeDriver(chromeOptions);
        driver.get(driverXmlReader.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Override
    public Object getBrowserOptions(DriverXmlReader driverXmlReader) {
        ChromeOptions chromeOptions = new ChromeOptions();
        if (!driverXmlReader.headless.isEmpty()) {
            chromeOptions.addArguments(driverXmlReader.headless);
        }
        chromeOptions.addArguments(driverXmlReader.resolution);
        chromeOptions.addArguments(driverXmlReader.gpu);
        chromeOptions.addArguments(driverXmlReader.extensions);
        return chromeOptions;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
