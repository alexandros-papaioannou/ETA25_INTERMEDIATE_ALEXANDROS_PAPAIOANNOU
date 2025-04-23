package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.AlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest {

    @Test
    public void allAlerts() {
        AlertsPage alertsPage = new AlertsPage(driver);
        Assert.assertTrue(alertsPage.isLoginPageBannerDisplayed());
        Assert.assertTrue(alertsPage.isAlertsFrameAndWindowsButtonDisplayed());
        Assert.assertEquals(alertsPage.getTextFromAlertsFrameAndWindowsButton(), "Alerts, Frame & Windows");
        alertsPage.scrollToAlertsFrameAndWindowsButton();
        alertsPage.goToMenuItem("Alerts, Frame & Windows");
        //alertsPage.clickAlertsFrameAndWindowsButton();
        Assert.assertEquals(alertsPage.getTextFromAlertsButton(),"Alerts");
        alertsPage.goToSubMenuItem("Alerts");
        //alertsPage.clickAlertsButton();
        Assert.assertTrue(alertsPage.isAlertsHeaderDisplayed());
        Assert.assertEquals(alertsPage.getTextFromAlertsHeader(),"Alerts");
        Assert.assertEquals(alertsPage.getTextFromClickMeAlertButtonLabel(),"Click Button to see alert");
        alertsPage.acceptAlertClickMeAlertButton();
        Assert.assertEquals(alertsPage.getTextFromClickMeDelayAlertButtonLabel(),"On button click, alert will appear after 5 seconds");
        alertsPage.acceptAlertClickMeDelayAlertButton();
        Assert.assertEquals(alertsPage.getTextFromClickMeConfirmBoxButtonLabel(),"On button click, confirm box will appear");
        alertsPage.cancelAlertClickMeConfirmBoxButton();
        Assert.assertEquals(alertsPage.getTextFromClickMeConfirmBoxButtonMessage(),"You selected Cancel");
        Assert.assertEquals(alertsPage.getTextFromClickMePromptBoxButtonLabel(),"On button click, prompt box will appear");
        alertsPage.setPromptBoxAndAcceptAlert();
        Assert.assertEquals(alertsPage.getTextFromClickMePromptBoxButtonMessage(),"You entered Test Automation");
    }
}
