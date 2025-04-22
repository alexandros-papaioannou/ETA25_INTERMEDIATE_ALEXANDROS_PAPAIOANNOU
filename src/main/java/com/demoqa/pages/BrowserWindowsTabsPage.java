package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTabsPage extends MasterPage {

    public BrowserWindowsTabsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Browser Windows']")
    private WebElement browserWindowsHeader;

    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    @FindBy(id = "messageWindowButton")
    private WebElement newWindowMessageButton;

    @FindBy(id = "sampleHeading")
    private WebElement newTabTitle;

    @FindBy(id = "sampleHeading")
    private WebElement newWindowTitle;

    //List<String> tabList = new ArrayList<>(driver.getWindowHandles());

    public boolean isBrowserWindowsHeaderDisplayed() {
        return isWebElementDisplayed(browserWindowsHeader);
    }

    public String getTextFromBrowserWindowsHeader() {
        return getTextFromElement(browserWindowsHeader);
    }

    public void clickNewTabButton() {
        click(newTabButton);
    }

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void clickNewWindowMessageButton() {
        click(newWindowMessageButton);
    }

    public String getTextFromNewTabTitle() {
        return getTextFromElement(newTabTitle);
    }

    public void scrollToBrowserWindowsHeader() {
        scrollToElement(driver, browserWindowsHeader);
    }

    public String getTextFromNewWindowTitle() {
        return getTextFromElement(newWindowTitle);
    }
}
