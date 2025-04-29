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
        Assert.assertEquals(formsPage.getTextFromPracticeFormButton(),"Practice Form");
        formsPage.goToSubMenuItem("Practice Form");
        Assert.assertTrue(formsPage.isFormsHeaderDisplayed());
        Assert.assertEquals(formsPage.getTextFromFormsHeader(),"Practice Form");
        Assert.assertTrue(formsPage.isFormsSubTitleDisplayed());
        Assert.assertEquals(formsPage.getTextFromFormsSubTitle(),"Student Registration Form");
    }
}
