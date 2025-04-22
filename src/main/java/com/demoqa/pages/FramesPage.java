package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends MasterPage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Frames']")
    private WebElement framesHeader;

    @FindBy(xpath = "//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]")
    private WebElement framesDescription;

    @FindBy(id = "frame1")
    private WebElement frameOne;

    @FindBy(id = "sampleHeading")
    private WebElement frameOneHeader;

    @FindBy(id = "frame2")
    private WebElement frameTwo;

    public boolean isFramesHeaderDisplayed() {
        return isWebElementDisplayed(framesHeader);
    }

    public String getTextFromFramesHeader() {
        return getTextFromElement(framesHeader);
    }

    public boolean isFramesDescriptionDisplayed() {
        return isWebElementDisplayed(framesDescription);
    }

    public String getTextFromFramesDescription() {
        return getTextFromElement(framesDescription);
    }

    public void navigateToFrameOne() {
        navigateToFrame(frameOne);
    }

    public boolean isFrameOneHeaderDisplayed() {
        return isWebElementDisplayed(frameOneHeader);
    }

    public String getTextFromFrameOneHeader() {
        return getTextFromElement(frameOneHeader);
    }

    public void navigateToFrameTwo() {
        navigateToFrame(frameTwo);
    }

    public void scrollToFrameTwo() {
        scrollToElement(driver, frameTwo);
    }

    public void scrollAxisInFrameTwo(int xAxis, int yAxis) {
        scrollAxis(driver, frameTwo, xAxis, yAxis);
    }
}
