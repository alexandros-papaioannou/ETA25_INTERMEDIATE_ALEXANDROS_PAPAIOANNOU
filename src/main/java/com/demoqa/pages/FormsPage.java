package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends MasterPage {

    public FormsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Practice Form']")
    private WebElement formsTitle;

    @FindBy(xpath = "//h5[text()='Student Registration Form']")
    private WebElement formsSubTitle;

    public boolean isFormsHeaderDisplayed() {
        return isWebElementDisplayed(formsTitle);
    }

    public boolean isFormsSubTitleDisplayed() {
        return isWebElementDisplayed(formsSubTitle);
    }

    public String getTextFromFormsHeader() {
        return  getTextFromElement(formsTitle);
    }

    public String getTextFromFormsSubTitle() {
        return getTextFromElement(formsSubTitle);
    }

}
