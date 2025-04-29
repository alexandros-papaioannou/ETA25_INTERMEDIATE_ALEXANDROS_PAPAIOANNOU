package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.FormsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormsTests extends BaseTest {

    @Test
    public void allForms() {
        FormsPage formsPage = new FormsPage(driver);
        Assert.assertTrue(formsPage.isLoginPageBannerDisplayed());
        Assert.assertTrue(formsPage.isFormsButtonDisplayed());
        Assert.assertEquals(formsPage.getTextFromFormsButton(), "Forms");
        formsPage.scrollToFormsButton();
        formsPage.goToMenuItem("Forms");
        Assert.assertEquals(formsPage.getTextFromPracticeFormButton(), "Practice Form");
        formsPage.goToSubMenuItem("Practice Form");
        Assert.assertTrue(formsPage.isFormsHeaderDisplayed());
        Assert.assertEquals(formsPage.getTextFromFormsHeader(), "Practice Form");
        Assert.assertTrue(formsPage.isFormsSubTitleDisplayed());
        Assert.assertEquals(formsPage.getTextFromFormsSubTitle(), "Student Registration Form");
        Assert.assertTrue(formsPage.isUserNameLabelDisplayed());
        Assert.assertEquals(formsPage.getTextFromUserNameLabel(), "Name");
        Assert.assertTrue(formsPage.isFirstNameFieldDisplayed());
        formsPage.setFirstNameField("Johnny");
        Assert.assertTrue(formsPage.isLastNameFieldDisplayed());
        formsPage.setLastNameField("Bravo");
        Assert.assertTrue(formsPage.isEmailLabelDisplayed());
        Assert.assertEquals(formsPage.getTextFromEmailLabel(), "Email");
        Assert.assertTrue(formsPage.isEmailFieldDisplayed());
        formsPage.scrollToEmailField();
        formsPage.setEmailField("Johnny@Bravo.com");
        Assert.assertTrue(formsPage.isGenderLabelDisplayed());
        Assert.assertEquals(formsPage.getTextFromGenderLabel(), "Gender");
        Assert.assertTrue(formsPage.isMaleGenderLabelDisplayed());
        Assert.assertEquals(formsPage.getTextFromMaleGenderLabel(), "Male");
        Assert.assertTrue(formsPage.isFemaleGenderLabelDisplayed());
        Assert.assertEquals(formsPage.getTextFromFemaleGenderLabel(), "Female");
        Assert.assertTrue(formsPage.isOtherGenderLabelDisplayed());
        Assert.assertEquals(formsPage.getTextFromOtherGenderLabel(), "Other");
        formsPage.setGender("Male");
        Assert.assertTrue(formsPage.isMobileLabelDisplayed());
        Assert.assertEquals(formsPage.getTextFromMobileLabel(), "Mobile(10 Digits)");
        Assert.assertTrue(formsPage.isMobileFieldDisplayed());
        formsPage.setMobileField("+40732222222");
        Assert.assertTrue(formsPage.isDateOfBirthLabelDisplayed());
        Assert.assertEquals(formsPage.getTextFromDateOfBirthLabel(), "Date of Birth");
        Assert.assertTrue(formsPage.isDateOfBirthFieldDisplayed());
        formsPage.setDateOfBirth("February", "1987", 25);
    }
}
