package com.demoqa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MasterPage {

    protected WebDriver driver;

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    protected WebElement loginPageBanner;

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    protected WebElement alertsFrameAndWindowsButton;

    @FindBy(xpath = "//span[text()='Alerts']")
    protected WebElement alertsButton;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    protected WebElement browserWindowsButton;

    @FindBy(xpath = "//span[text()='Frames']")
    protected WebElement framesButton;

    public MasterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void set(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public void setAlert(Alert alert, String text) {
        alert.sendKeys(text);
    }

    public void click(WebElement element) {
        element.click();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public boolean isWebElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollAxis(WebDriver driver, WebElement element, int xAxis, int yAxis) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(arguments[0], arguments[1]);", xAxis, yAxis);
    }

    public void waitForAlert(WebDriver driver, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public boolean isLoginPageBannerDisplayed() {
        return isWebElementDisplayed(loginPageBanner);
    }

    public boolean isAlertsFrameAndWindowsButtonDisplayed() {
        return isWebElementDisplayed(alertsFrameAndWindowsButton);
    }

    public String getTextFromAlertsFrameAndWindowsButton() {
        return getTextFromElement(alertsFrameAndWindowsButton);
    }

    public void scrollToAlertsFrameAndWindowsButton() {
        scrollToElement(driver, alertsFrameAndWindowsButton);
    }

    public void clickAlertsFrameAndWindowsButton() {
        click(alertsFrameAndWindowsButton);
    }

    public void clickAlertsButton() {
        click(alertsButton);
    }

    public String getTextFromAlertsButton() {
        return getTextFromElement(alertsButton);
    }

    public String getTextFromBrowserWindowsButton() {
        return getTextFromElement(browserWindowsButton);
    }

    public void clickBrowserWindowsButton() {
        click(browserWindowsButton);
    }

    public void browseTabOrWindowByIndex(WebDriver driver, int index) {
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        if (index < 0 || index >= tabList.size()) {
            throw new IllegalArgumentException("Invalid tab index: " + index);
        }
        driver.switchTo().window(tabList.get(index));
    }

    public void closeTabOrWindowByIndex(WebDriver driver, int index) {
        browseTabOrWindowByIndex(driver, index);
        driver.close();
    }

    public void navigateToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void focusOnMainPage() {
        driver.switchTo().defaultContent();
    }

    public String getTextFromFramesButton() {
        return getTextFromElement(framesButton);
    }

    public void clickFramesButton() {
        click(framesButton);
    }
}
