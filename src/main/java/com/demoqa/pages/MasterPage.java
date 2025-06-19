package com.demoqa.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.logger.LoggerUtility;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MasterPage {

    protected WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    protected WebElement loginPageBanner;

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    protected WebElement alertsFrameAndWindowsButton;

    @FindBy(xpath = "//h5[text()='Forms']")
    protected WebElement formsButton;

    @FindBy(xpath = "//span[text()='Practice Form']")
    protected WebElement practiceFormButton;

    @FindBy(xpath = "//span[text()='Alerts']")
    protected WebElement alertsButton;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    protected WebElement browserWindowsButton;

    @FindBy(xpath = "//span[text()='Frames']")
    protected WebElement framesButton;

    @FindBy(xpath = "//h5")
    protected List<WebElement> menuItem;

    @FindBy(xpath = "//span[@class='text']")
    protected List<WebElement> subMenuItem;

    public MasterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
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

    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
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

    public boolean isFormsButtonDisplayed() {
        return isWebElementDisplayed(formsButton);
    }

    public String getTextFromAlertsFrameAndWindowsButton() {
        return getTextFromElement(alertsFrameAndWindowsButton);
    }

    public String getTextFromFormsButton() {
        return  getTextFromElement(formsButton);
    }

    public String getTextFromPracticeFormButton() {
        return getTextFromElement(practiceFormButton);
    }

    public void scrollToAlertsFrameAndWindowsButton() {
        scrollToElement(driver, alertsFrameAndWindowsButton);
        LoggerUtility.infoLog("User scrolled to element " + alertsFrameAndWindowsButton.getText());
    }

    public void scrollToFormsButton() {
        scrollToElement(driver, formsButton);
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

    public void selectMenuItemByText(List<WebElement> menuItem, String menuName) {
        for (WebElement webElement : menuItem) {
            if (getTextFromElement(webElement).equals(menuName)) {
                click(webElement);
                LoggerUtility.infoLog("User navigated on menu " + menuName);
                break;
            }
        }
    }

    public void goToMenuItem(String menuName) {
        selectMenuItemByText(menuItem, menuName);
    }

    public void goToSubMenuItem(String subMenuName) {
        selectMenuItemByText(subMenuItem, subMenuName);
    }

    public void fillValues(WebElement element, List<String> values) {
        for (String value : values) {
            element.sendKeys(value);
            element.sendKeys(Keys.ENTER);
        }
    }
}
