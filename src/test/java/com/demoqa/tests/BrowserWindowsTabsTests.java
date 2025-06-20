package com.demoqa.tests;

import com.demoqa.pages.BrowserWindowsTabsPage;
import com.demoqa.base.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserWindowsTabsTests extends Hooks {

    @Test
    public void browserWindowsTabsTests() {
        BrowserWindowsTabsPage browserWindowsTabsPage = new BrowserWindowsTabsPage(driver);
        Assert.assertTrue(browserWindowsTabsPage.isLoginPageBannerDisplayed());
        Assert.assertTrue(browserWindowsTabsPage.isAlertsFrameAndWindowsButtonDisplayed());
        Assert.assertEquals(browserWindowsTabsPage.getTextFromAlertsFrameAndWindowsButton(), "Alerts, Frame & Windows");
        browserWindowsTabsPage.scrollToAlertsFrameAndWindowsButton();
        browserWindowsTabsPage.goToMenuItem("Alerts, Frame & Windows");
        //browserWindowsTabsPage.clickAlertsFrameAndWindowsButton();
        Assert.assertEquals(browserWindowsTabsPage.getTextFromBrowserWindowsButton(),"Browser Windows");
        browserWindowsTabsPage.goToSubMenuItem("Browser Windows");
        //browserWindowsTabsPage.clickBrowserWindowsButton();
        Assert.assertTrue(browserWindowsTabsPage.isBrowserWindowsHeaderDisplayed());
        Assert.assertEquals(browserWindowsTabsPage.getTextFromBrowserWindowsHeader(),"Browser Windows");
        browserWindowsTabsPage.clickNewTabButton();
        browserWindowsTabsPage.browseTabOrWindowByIndex(driver,1);
        Assert.assertEquals(browserWindowsTabsPage.getTextFromNewTabTitle(),"This is a sample page");
        browserWindowsTabsPage.closeTabOrWindowByIndex(driver,1);
        browserWindowsTabsPage.browseTabOrWindowByIndex(driver,0);
        browserWindowsTabsPage.scrollToBrowserWindowsHeader();
        Assert.assertEquals(browserWindowsTabsPage.getTextFromBrowserWindowsHeader(),"Browser Windows");
        browserWindowsTabsPage.clickNewWindowButton();
        browserWindowsTabsPage.browseTabOrWindowByIndex(driver,1);
        Assert.assertEquals(browserWindowsTabsPage.getTextFromNewWindowTitle(),"This is a sample page");
        browserWindowsTabsPage.closeTabOrWindowByIndex(driver,1);
        browserWindowsTabsPage.browseTabOrWindowByIndex(driver,0);
        Assert.assertEquals(browserWindowsTabsPage.getTextFromFramesButton(),"Frames");
        browserWindowsTabsPage.clickFramesButton();
    }
}
