package com.demoqa.base;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import utils.logger.LoggerUtility;

public class Hooks extends BaseTest {

    public String testName;

    @BeforeMethod
    public void prepareEnvironment() {
        testName = this.getClass().getSimpleName();
        utils.logger.LoggerUtility.startTestCase(testName);
        setUp();
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            LoggerUtility.errorLog(result.getThrowable().getMessage());
        }
        tearDown();
        utils.logger.LoggerUtility.endTestCase(testName);
    }

    @AfterSuite
    public void generateConsolidatedLogs() {
        LoggerUtility.mergeLogs();
    }
}
