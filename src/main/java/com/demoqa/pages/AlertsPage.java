package com.demoqa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends MasterPage {


    public AlertsPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
//    private WebElement loginPageBanner;
//
//    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
//    private WebElement alertsFrameAndWindowsButton;
//
//    @FindBy(xpath = "//span[text()='Alerts']")
//    private WebElement alertsButton;

    @FindBy(xpath = "//h1[text()='Alerts']")
    private WebElement alertsHeader;

    @FindBy(id = "alertButton")
    private WebElement clickMeAlertButton;

    @FindBy(xpath = "//span[text()='Click Button to see alert ']")
    private WebElement clickMeAlertButtonLabel;

    @FindBy(id = "timerAlertButton")
    private WebElement clickMeDelayAlertButton;

    @FindBy(xpath = "//span[text()='On button click, alert will appear after 5 seconds ']")
    private WebElement clickMeDelayAlertButtonLabel;

    @FindBy(id = "confirmButton")
    private WebElement clickMeConfirmBoxButton;

    @FindBy(xpath = "//span[text()='On button click, confirm box will appear']")
    private WebElement clickMeConfirmBoxButtonLabel;

    @FindBy(xpath = "//span[@id='confirmResult']")
    private WebElement clickMeConfirmBoxButtonMessage;

    @FindBy(id = "promtButton")
    private WebElement clickMePromptBoxButton;

    @FindBy(xpath = "//span[text()='On button click, prompt box will appear']")
    private WebElement clickMePromptBoxButtonLabel;

    @FindBy(id = "promptResult")
    private WebElement clickMePromptBoxButtonMessage;

//    public boolean isLoginPageBannerDisplayed() {
//        return isWebElementDisplayed(loginPageBanner);
//    }
//
//    public boolean isAlertsFrameAndWindowsButtonDisplayed() {
//        return isWebElementDisplayed(alertsFrameAndWindowsButton);
//    }
//
//    public String getTextFromAlertsFrameAndWindowsButton() {
//        return getTextFromElement(alertsFrameAndWindowsButton);
//    }

//    public void scrollToAlertsFrameAndWindowsButton() {
//        scrollToElement(driver, alertsFrameAndWindowsButton);
//    }
//
//    public void clickAlertsFrameAndWindowsButton() {
//        click(alertsFrameAndWindowsButton);
//    }

//    public void clickAlertsButton() {
//        click(alertsButton);
//    }
//
//    public String getTextFromAlertsButton() {
//        return getTextFromElement(alertsButton);
//    }

    public boolean isAlertsHeaderDisplayed() {
        return isWebElementDisplayed(alertsHeader);
    }

    public String getTextFromAlertsHeader() {
        return getTextFromElement(alertsHeader);
    }

    public String getTextFromClickMeAlertButtonLabel() {
        return getTextFromElement(clickMeAlertButtonLabel);
    }

    public void clickClickMeAlertButton() {
        click(clickMeAlertButton);
    }

    public void acceptAlertClickMeAlertButton() {
        clickClickMeAlertButton();
        Alert alertNormal = driver.switchTo().alert();
        alertNormal.accept();
    }

    public String getTextFromClickMeDelayAlertButtonLabel() {
        return getTextFromElement(clickMeDelayAlertButtonLabel);
    }

    public void clickClickMeDelayAlertButton() {
        click(clickMeDelayAlertButton);
    }

    public void acceptAlertClickMeDelayAlertButton() {
        clickClickMeDelayAlertButton();
        waitForAlert(driver, 10);
        Alert alertDelay = driver.switchTo().alert();
        alertDelay.accept();
    }

    public String getTextFromClickMeConfirmBoxButtonLabel() {
        return getTextFromElement(clickMeConfirmBoxButtonLabel);
    }

    public void clickClickMeConfirmBoxButton() {
        click(clickMeConfirmBoxButton);
    }

    public void cancelAlertClickMeConfirmBoxButton() {
        clickClickMeConfirmBoxButton();
        Alert alertConfirmBox = driver.switchTo().alert();
        alertConfirmBox.dismiss();
    }

    public String getTextFromClickMeConfirmBoxButtonMessage() {
        return getTextFromElement(clickMeConfirmBoxButtonMessage);
    }

    public String getTextFromClickMePromptBoxButtonLabel() {
        return getTextFromElement(clickMePromptBoxButtonLabel);
    }

    public void clickClickMePromptBoxButton() {
        click(clickMePromptBoxButton);
    }

    public void setPromptBoxAndAcceptAlert() {
        clickClickMePromptBoxButton();
        Alert alertPromptBox = driver.switchTo().alert();
        setAlert(alertPromptBox,"Test Automation");
        alertPromptBox.accept();
    }

    public String getTextFromClickMePromptBoxButtonMessage() {
        return getTextFromElement(clickMePromptBoxButtonMessage);
    }
}
