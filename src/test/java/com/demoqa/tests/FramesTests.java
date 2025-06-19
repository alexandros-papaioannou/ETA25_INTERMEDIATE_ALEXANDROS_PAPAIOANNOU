package com.demoqa.tests;

import com.demoqa.pages.FramesPage;
import com.demoqa.base.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTests extends Hooks {

    @Test
    public void framesTests() {
        FramesPage framesPage = new FramesPage(driver);
        Assert.assertTrue(framesPage.isLoginPageBannerDisplayed());
        Assert.assertTrue(framesPage.isAlertsFrameAndWindowsButtonDisplayed());
        Assert.assertEquals(framesPage.getTextFromAlertsFrameAndWindowsButton(), "Alerts, Frame & Windows");
        framesPage.scrollToAlertsFrameAndWindowsButton();
        framesPage.goToMenuItem("Alerts, Frame & Windows");
        //framesPage.clickAlertsFrameAndWindowsButton();
        Assert.assertEquals(framesPage.getTextFromFramesButton(), "Frames");
        framesPage.goToSubMenuItem("Frames");
        //framesPage.clickFramesButton();
        Assert.assertTrue(framesPage.isFramesHeaderDisplayed());
        Assert.assertEquals(framesPage.getTextFromFramesHeader(), "Frames");
        Assert.assertTrue(framesPage.isFramesDescriptionDisplayed());
        Assert.assertEquals(framesPage.getTextFromFramesDescription(), "Sample Iframe page There are 2 Iframes in this page. " +
                "Use browser inspecter or firebug to check out the HTML source. " +
                "In total you can switch between the parent frame, which is this window, and the two frames below");
        framesPage.navigateToFrameOne();
        Assert.assertTrue(framesPage.isFrameOneHeaderDisplayed());
        Assert.assertEquals(framesPage.getTextFromFrameOneHeader(), "This is a sample page");
        framesPage.focusOnMainPage();
        framesPage.scrollToFrameTwo();
        framesPage.navigateToFrameTwo();
        framesPage.scrollAxisInFrameTwo(100,150);
    }
}
