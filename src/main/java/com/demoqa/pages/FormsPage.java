package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @FindBy(id = "subjects-label")
    private WebElement subjectsLabel;

    @FindBy(id = "subjectsInput")
    private WebElement subjectsField;

    @FindBy(xpath = "//label[text()='Hobbies']")
    private WebElement hobbiesLabel;

    @FindBy(xpath = "//label[text()='Sports']")
    private WebElement hobbiesSportsLabel;

    @FindBy(xpath = "//label[text()='Reading']")
    private WebElement hobbiesReadingLabel;

    @FindBy(xpath = "//label[text()='Music']")
    private WebElement hobbiesMusicLabel;

    @FindBy(xpath = "//label[text()='Picture']")
    private WebElement pictureLabel;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPictureButton;

    @FindBy(id = "currentAddress-label")
    private WebElement currentAddressLabel;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;

    @FindBy(id = "stateCity-label")
    private WebElement stateCityLabel;

    @FindBy(id = "state")
    private WebElement stateDropDown;

    @FindBy(id = "city")
    private WebElement cityDropDown;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement modalTitle;

    @FindBy(xpath = "//td[text()='Student Name']")
    private WebElement modalStudentNameLabel;

    @FindBy(xpath = "//td[text()='Student Name']/following-sibling::td")
    private WebElement modalStudentNameValue;

    @FindBy(xpath = "//td[text()='Student Email']")
    private WebElement modalStudentEmailLabel;

    @FindBy(xpath = "//td[text()='Student Email']/following-sibling::td")
    private WebElement modalStudentEmailValue;

    @FindBy(xpath = "//td[text()='Gender']")
    private WebElement modalGenderLabel;

    @FindBy(xpath = "//td[text()='Gender']/following-sibling::td")
    private WebElement modalGenderValue;

    @FindBy(xpath = "//td[text()='Mobile']")
    private WebElement modalMobileLabel;

    @FindBy(xpath = "//td[text()='Mobile']/following-sibling::td")
    private WebElement modalMobileValue;

    @FindBy(xpath = "//td[text()='Date of Birth']")
    private WebElement modalDateOfBirthLabel;

    @FindBy(xpath = "//td[text()='Date of Birth']/following-sibling::td")
    private WebElement modalDateOfBirthValue;

    @FindBy(xpath = "//td[text()='Subjects']")
    private WebElement modalSubjectsLabel;

    @FindBy(xpath = "//td[text()='Subjects']/following-sibling::td")
    private WebElement modalSubjectsValue;

    @FindBy(xpath = "//td[text()='Hobbies']")
    private WebElement modalHobbiesLabel;

    @FindBy(xpath = "//td[text()='Hobbies']/following-sibling::td")
    private WebElement modalHobbiesValue;

    @FindBy(xpath = "//td[text()='Picture']")
    private WebElement modalPictureLabel;

    @FindBy(xpath = "//td[text()='Picture']/following-sibling::td")
    private WebElement modalPictureValue;

    @FindBy(xpath = "//td[text()='Address']")
    private WebElement modalAddressLabel;

    @FindBy(xpath = "//td[text()='Address']/following-sibling::td")
    private WebElement modalAddressValue;

    @FindBy(xpath = "//td[text()='State and City']")
    private WebElement modalStateCityLabel;

    @FindBy(xpath = "//td[text()='State and City']/following-sibling::td")
    private WebElement modalStateCityValue;

    @FindBy(id = "closeLargeModal")
    private WebElement closeModalButton;

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

    public boolean isSubjectsLabelDisplayed() {
        return isWebElementDisplayed(subjectsLabel);
    }

    public boolean isSubjectsFieldDisplayed() {
        return isWebElementDisplayed(subjectsField);
    }

    public boolean isHobbiesLabelDisplayed() {
        return isWebElementDisplayed(hobbiesLabel);
    }

    public boolean isHobbiesSportsLabelDisplayed() {
        return isWebElementDisplayed(hobbiesSportsLabel);
    }

    public boolean isHobbiesReadingLabelDisplayed() {
        return isWebElementDisplayed(hobbiesReadingLabel);
    }

    public boolean isHobbiesMusicLabelDisplayed() {
        return isWebElementDisplayed(hobbiesMusicLabel);
    }

    public boolean isPictureLabelDisplayed() {
        return isWebElementDisplayed(pictureLabel);
    }

    public boolean isUploadPictureButtonDisplayed() {
        return isWebElementDisplayed(uploadPictureButton);
    }

    public boolean isCurrentAddressLabelDisplayed() {
        return isWebElementDisplayed(currentAddressLabel);
    }

    public boolean isCurrentAddressFieldDisplayed() {
        return isWebElementDisplayed(currentAddressField);
    }

    public boolean isStateCityLabelDisplayed() {
        return isWebElementDisplayed(stateCityLabel);
    }

    public boolean isStateDropDownDisplayed() {
        return isWebElementDisplayed(stateDropDown);
    }

    public boolean isCityDropDownDisplayed() {
        return isWebElementDisplayed(cityDropDown);
    }

    public boolean isSubmitButtonDisplayed() {
        return isWebElementDisplayed(submitButton);
    }

    public boolean isModalWindowDisplayed() {
        waitForElementToBeVisible(modalTitle);
        return isWebElementDisplayed(modalTitle);
    }

    public boolean isModalStudentNameLabelDisplayed() {
        return isWebElementDisplayed(modalStudentNameLabel);
    }

    public boolean isModalStudentNameValueDisplayed() {
        return isWebElementDisplayed(modalStudentNameValue);
    }

    public boolean isModalStudentEmailLabelDisplayed() {
        return isWebElementDisplayed(modalStudentEmailLabel);
    }

    public boolean isModalStudentEmailValueDisplayed() {
        return isWebElementDisplayed(modalStudentEmailValue);
    }

    public boolean isModalGenderLabelDisplayed() {
        return isWebElementDisplayed(modalGenderLabel);
    }

    public boolean isModalGenderValueDisplayed() {
        return isWebElementDisplayed(modalGenderValue);
    }

    public boolean isModalMobileLabelDisplayed() {
        return isWebElementDisplayed(modalMobileLabel);
    }

    public boolean isModalMobileValueDisplayed() {
        return isWebElementDisplayed(modalMobileValue);
    }

    public boolean isModalDateOfBirthLabelDisplayed() {
        return isWebElementDisplayed(modalDateOfBirthLabel);
    }

    public boolean isModalDateOfBirthValueDisplayed() {
        return isWebElementDisplayed(modalDateOfBirthValue);
    }

    public boolean isModalSubjectsLabelDisplayed() {
        return isWebElementDisplayed(modalSubjectsLabel);
    }

    public boolean isModalSubjectsValueDisplayed() {
        return isWebElementDisplayed(modalSubjectsValue);
    }

    public boolean isModalHobbiesLabelDisplayed() {
        return isWebElementDisplayed(modalHobbiesLabel);
    }

    public boolean isModalHobbiesValueDisplayed() {
        return isWebElementDisplayed(modalHobbiesValue);
    }

    public boolean isModalPictureLabelDisplayed() {
        return isWebElementDisplayed(modalPictureLabel);
    }

    public boolean isModalPictureValueDisplayed() {
        return isWebElementDisplayed(modalPictureValue);
    }

    public boolean isModalAddressLabelDisplayed() {
        return isWebElementDisplayed(modalAddressLabel);
    }

    public boolean isModalAddressValueDisplayed() {
        return isWebElementDisplayed(modalAddressValue);
    }

    public boolean isModalStateCityLabelDisplayed() {
        return isWebElementDisplayed(modalStateCityLabel);
    }

    public boolean isModalStateCityValueDisplayed() {
        return isWebElementDisplayed(modalStateCityValue);
    }

    public boolean isCloseModalButtonDisplayed() {
        return isWebElementDisplayed(closeModalButton);
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

    public String getTextFromSubjectsLabel() {
        return getTextFromElement(subjectsLabel);
    }

    public String getTextFromHobbiesLabel() {
        return getTextFromElement(hobbiesLabel);
    }

    public String getTextFromHobbiesSportsLabel() {
        return getTextFromElement(hobbiesSportsLabel);
    }

    public String getTextFromHobbiesReadingLabel() {
        return getTextFromElement(hobbiesReadingLabel);
    }

    public String getTextFromHobbiesMusicLabel() {
        return getTextFromElement(hobbiesMusicLabel);
    }

    public String getTextFromPictureLabel() {
        return getTextFromElement(pictureLabel);
    }

    public String getTextFromCurrentAddressLabel() {
        return getTextFromElement(currentAddressLabel);
    }

    public String getTextFromStateCityLabel() {
        return getTextFromElement(stateCityLabel);
    }

    public String getTextFromSubmitButton() {
        return getTextFromElement(submitButton);
    }

    public String getTextFromModalStudentName() {
        return getTextFromElement(modalStudentNameLabel);
    }

    public String getTextFromModalStudentNameValue() {
        return getTextFromElement(modalStudentNameValue);
    }

    public String getTextFromModalStudentEmailLabel() {
        return getTextFromElement(modalStudentEmailLabel);
    }

    public String getTextFromModalStudentEmailValue() {
        return getTextFromElement(modalStudentEmailValue);
    }

    public String getTextFromModalGenderLabel() {
        return getTextFromElement(modalGenderLabel);
    }

    public String getTextFromModalGenderValue() {
        return getTextFromElement(modalGenderValue);
    }

    public String getTextFromModalMobileLabel() {
        return getTextFromElement(modalMobileLabel);
    }

    public String getTextFromModalMobileValue() {
        return getTextFromElement(modalMobileValue);
    }

    public String getTextFromModalDateOfBirthLabel() {
        return getTextFromElement(modalDateOfBirthLabel);
    }

    public String getTextFromModalDateOfBirthValue() {
        return getTextFromElement(modalDateOfBirthValue);
    }

    public String getTextFromModalSubjectsLabel() {
        return getTextFromElement(modalSubjectsLabel);
    }

    public String getTextFromModalSubjectsValue() {
        return getTextFromElement(modalSubjectsValue);
    }

    public String getTextFromModalHobbiesLabel() {
        return getTextFromElement(modalHobbiesLabel);
    }

    public String getTextFromModalHobbiesValue() {
        return getTextFromElement(modalHobbiesValue);
    }

    public String getTextFromModalPictureLabel() {
        return getTextFromElement(modalPictureLabel);
    }

    public String getTextFromModalPictureValue() {
        return getTextFromElement(modalPictureValue);
    }

    public String getTextFromModalAddressLabel() {
        return getTextFromElement(modalAddressLabel);
    }

    public String getTextFromModalAddressValue() {
        return getTextFromElement(modalAddressValue);
    }

    public String getTextFromModalStateCityLabel() {
        return getTextFromElement(modalStateCityLabel);
    }

    public String getTextFromModalStateCityValue() {
        return getTextFromElement(modalStateCityValue);
    }

    public String getTextFromCloseModalButton() {
        return getTextFromElement(closeModalButton);
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

    public void scrollToCloseModalButton() {
        scrollToElement(driver, closeModalButton);
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

    public void clickSubjectsField() {
        click(subjectsField);
    }

    public void clickSubmitButton() {
        click(submitButton);
    }

    public void clickCloseModalButton() {
        //((JavascriptExecutor) driver).executeScript("document.querySelectorAll('iframe, .google-auto-placed, #adplus-anchor').forEach(el => el.remove());");
        click(closeModalButton);
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

    public void setSubjectsField(List<String> list) {
        //clickSubjectsField();
        click(subjectsField);
        fillValues(subjectsField, list);
    }

    public void setHobby(List<String> hobbiesList) {
        Map<String, WebElement> hobbiesMap = new HashMap<>();
        hobbiesMap.put("Sports", hobbiesSportsLabel);
        hobbiesMap.put("Reading", hobbiesReadingLabel);
        hobbiesMap.put("Music", hobbiesMusicLabel);

        for (String hobby: hobbiesList) {
            WebElement checkbox = hobbiesMap.get(hobby);
            if (checkbox != null && !checkbox.isSelected()) {
                click(checkbox);
            } else if (checkbox == null) {
                System.out.println("Hobby not found: " + hobby);
            }
        }
    }

    public void uploadPicture(String filePath) {
        set(uploadPictureButton, filePath);
    }

    public String getUploadedFilePath() {
        return uploadPictureButton.getAttribute("value");
    }

    public void setCurrentAddressField(String text) {
        set(currentAddressField, text);
    }

    public void setState(String stateName) {
        scrollToElement(driver, stateDropDown);
        click(stateDropDown);
        String xpath = String.format("//div[contains(@id, 'react-select-3-option') and text()='%s']", stateName);
        WebElement stateOption = driver.findElement(By.xpath(xpath));
        click(stateOption);
    }

    public void setCity(String cityName) {
        click(cityDropDown);
        String xpath = String.format("//div[contains(@id, 'react-select-4-option') and text()='%s']", cityName);
        WebElement cityOption = driver.findElement(By.xpath(xpath));
        click(cityOption);
    }

//    public void waitForModalWindow() {
//        waitForElementToBeVisible(modalTitle);
//    }
}

