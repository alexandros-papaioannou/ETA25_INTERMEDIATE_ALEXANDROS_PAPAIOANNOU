package com.demoqa.base;

import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.extentUtility.ExtentUtility;
import utils.logger.LoggerUtility;

import static utils.WebDriverManager.getDriver;

public class Hooks extends BaseTest {

    public String testName;

    @BeforeSuite
    public void initialiseTestReport() {
        ExtentUtility.initialiseReport();
    }

    @BeforeMethod
    public void prepareEnvironment() {
        testName = this.getClass().getSimpleName();
        utils.logger.LoggerUtility.startTestCase(testName);
        ExtentUtility.createTest(testName);
        setUp();
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            String errorMessage = result.getThrowable().getMessage();
            LoggerUtility.errorLog(result.getThrowable().getMessage());
            ExtentUtility.attachLog(testName, errorMessage, driver);
        }
        tearDown();
        utils.logger.LoggerUtility.endTestCase(testName);
        ExtentUtility.finishTest(testName);
    }

    @AfterSuite
    public void generateConsolidatedLogs() {
        LoggerUtility.mergeLogs();
        ExtentUtility.generateReport();
    }
}
