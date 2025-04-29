package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormsPage extends MasterPage {

    public FormsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Practice Form']")
    private WebElement formsTitle;

    @FindBy(xpath = "//h5[text()='Student Registration Form']")
    private WebElement formsSubTitle;

    @FindBy(id = "userName-label")
    private WebElement userNameLabel;

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "userEmail-label")
    private WebElement emailLabel;

    @FindBy(id = "userEmail")
    private WebElement emailField;

    @FindBy(xpath = "//div[text()='Gender']")
    private WebElement genderLabel;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement maleGender;

    @FindBy(xpath = "//label[text()='Male']")
    private WebElement maleGenderLabel;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement femaleGender;

    @FindBy(xpath = "//label[text()='Female']")
    private WebElement femaleGenderLabel;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement otherGender;

    @FindBy(xpath = "//label[text()='Other']")
    private WebElement otherGenderLabel;

    @FindBy(id = "userNumber-label")
    private WebElement mobileLabel;

    @FindBy(id = "userNumber")
    private WebElement mobileField;

    @FindBy(id = "dateOfBirth-label")
    private WebElement dateOfBirthLabel;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthField;

    @FindBy(className = "react-datepicker__month-select")
    private WebElement dateOfBirthMonthPick;

    @FindBy(className = "react-datepicker__year-select")
    private WebElement dateOfBirthYearPick;

    @FindBy(xpath = "//div[contains(concat(' ', normalize-space(@class), ' '), ' react-datepicker__day ') and not(contains(@class, 'outside-month'))]")
    private List<WebElement> dateOfBirthDaysInAMonth;

    public boolean isFormsHeaderDisplayed() {
        return isWebElementDisplayed(formsTitle);
    }

    public boolean isFormsSubTitleDisplayed() {
        return isWebElementDisplayed(formsSubTitle);
    }

    public boolean isUserNameLabelDisplayed() {
        return isWebElementDisplayed(userNameLabel);
    }

    public boolean isFirstNameFieldDisplayed() {
        return isWebElementDisplayed(firstNameField);
    }

    public boolean isLastNameFieldDisplayed() {
        return isWebElementDisplayed(lastNameField);
    }

    public boolean isEmailLabelDisplayed() {
        return isWebElementDisplayed(emailLabel);
    }

    public boolean isEmailFieldDisplayed() {
        return isWebElementDisplayed(emailField);
    }

    public boolean isGenderLabelDisplayed() {
        return isWebElementDisplayed(genderLabel);
    }

    public boolean isMaleGenderLabelDisplayed() {
        return isWebElementDisplayed(maleGenderLabel);
    }

    public boolean isFemaleGenderLabelDisplayed() {
        return isWebElementDisplayed(femaleGenderLabel);
    }

    public boolean isOtherGenderLabelDisplayed() {
        return isWebElementDisplayed(otherGenderLabel);
    }

    public boolean isMobileLabelDisplayed() {
        return isWebElementDisplayed(mobileLabel);
    }

    public boolean isMobileFieldDisplayed() {
        return isWebElementDisplayed(mobileField);
    }

    public boolean isDateOfBirthLabelDisplayed() {
        return isWebElementDisplayed(dateOfBirthLabel);
    }

    public boolean isDateOfBirthFieldDisplayed() {
        return isWebElementDisplayed(dateOfBirthField);
    }

    public String getTextFromFormsHeader() {
        return getTextFromElement(formsTitle);
    }

    public String getTextFromFormsSubTitle() {
        return getTextFromElement(formsSubTitle);
    }

    public String getTextFromUserNameLabel() {
        return getTextFromElement(userNameLabel);
    }

    public String getTextFromEmailLabel() {
        return getTextFromElement(emailLabel);
    }

    public String getTextFromGenderLabel() {
        return getTextFromElement(genderLabel);
    }

    public String getTextFromMaleGenderLabel() {
        return getTextFromElement(maleGenderLabel);
    }

    public String getTextFromFemaleGenderLabel() {
        return getTextFromElement(femaleGenderLabel);
    }

    public String getTextFromOtherGenderLabel() {
        return getTextFromElement(otherGenderLabel);
    }

    public String getTextFromMobileLabel() {
        return getTextFromElement(mobileLabel);
    }

    public String getTextFromDateOfBirthLabel() {
        return getTextFromElement(dateOfBirthLabel);
    }

    public void setFirstNameField(String text) {
        set(firstNameField, text);
    }

    public void setLastNameField(String text) {
        set(lastNameField, text);
    }

    public void setEmailField(String text) {
        set(emailField, text);
    }

    public void scrollToEmailField() {
        scrollToElement(driver, emailField);
    }

    public void setGender(String gender) {
        switch (gender) {
            case "Male":
                click(maleGender);
                break;
            case "Female":
                click(femaleGender);
                break;
            case "Other":
                click(otherGender);
                break;
        }
    }

    public void setMobileField(String text) {
        set(mobileField, text);
    }

    public void clickDateOfBirthField() {
        click(dateOfBirthField);
    }

    public void clickDateOfBirthMonthPick() {
        click(dateOfBirthMonthPick);
    }

    public void clickDateOfBirthYearPick() {
        click(dateOfBirthYearPick);
    }

    public void setDateOfBirth(String monthText, String yearText, int day) {
        clickDateOfBirthField();

        clickDateOfBirthMonthPick();
        Select month = new Select(dateOfBirthMonthPick);
        month.selectByVisibleText(monthText);

        clickDateOfBirthYearPick();
        Select year = new Select(dateOfBirthYearPick);
        year.selectByVisibleText(yearText);

        for (WebElement dayElement : dateOfBirthDaysInAMonth) {
            if (dayElement.getText().equals(String.valueOf(day))) {
                click(dayElement);
                break;
            }
        }
    }

}
