package com.demoqa.tests;

import com.demoqa.pages.AlertsPage;
import com.demoqa.base.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.extentUtility.ExtentUtility;
import utils.extentUtility.ReportStep;

public class AlertsTests extends Hooks {

    @Test
    public void allAlerts() {
        AlertsPage alertsPage = new AlertsPage(driver);
        Assert.assertTrue(alertsPage.isLoginPageBannerDisplayed());
        Assert.assertTrue(alertsPage.isAlertsFrameAndWindowsButtonDisplayed());
        Assert.assertEquals(alertsPage.getTextFromAlertsFrameAndWindowsButton(), "Alerts, Frame & Windows");
        alertsPage.scrollToAlertsFrameAndWindowsButton();
        alertsPage.goToMenuItem("Alerts, Frame & Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user successfully enters Alerts, Frame & Windows menu");
        //alertsPage.clickAlertsFrameAndWindowsButton();
        Assert.assertEquals(alertsPage.getTextFromAlertsButton(),"Alerts");
        alertsPage.goToSubMenuItem("Alerts");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user successfully enters Alerts submenu");
        //alertsPage.clickAlertsButton();
        Assert.assertTrue(alertsPage.isAlertsHeaderDisplayed());
        Assert.assertEquals(alertsPage.getTextFromAlertsHeader(),"Alerts");
        Assert.assertEquals(alertsPage.getTextFromClickMeAlertButtonLabel(),"Click Button to see alert");
        alertsPage.acceptAlertClickMeAlertButton();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user successfully interacts with an alert");
        Assert.assertEquals(alertsPage.getTextFromClickMeDelayAlertButtonLabel(),"On button click, alert will appear after 5 seconds");
        alertsPage.acceptAlertClickMeDelayAlertButton();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user successfully interacts with an alert");
        Assert.assertEquals(alertsPage.getTextFromClickMeConfirmBoxButtonLabel(),"On button click, confirm box will appear");
        alertsPage.cancelAlertClickMeConfirmBoxButton();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user successfully interacts with an alert");
        Assert.assertEquals(alertsPage.getTextFromClickMeConfirmBoxButtonMessage(),"You selected Cancel");
        Assert.assertEquals(alertsPage.getTextFromClickMePromptBoxButtonLabel(),"On button click, prompt box will appear");
        alertsPage.setPromptBoxAndAcceptAlert();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user successfully interacts with an alert");
        Assert.assertEquals(alertsPage.getTextFromClickMePromptBoxButtonMessage(),"You entered Test Automation");
    }
}
