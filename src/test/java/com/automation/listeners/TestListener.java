package com.automation.listeners;

import com.automation.utils.ExtentReportManager;
import com.automation.utils.WebElementUtils;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    private static final Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Starting test: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test passed: " + result.getMethod().getMethodName());
        ExtentReportManager.getTest().log(Status.PASS, "Test passed successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test failed: " + result.getMethod().getMethodName());
        logger.error("Failure reason: " + result.getThrowable().getMessage());
        
        // Log failure in extent report
        ExtentReportManager.getTest().log(Status.FAIL, "Test failed: " + result.getThrowable().getMessage());
        
        // Take screenshot on failure
        try {
            Object testClass = result.getInstance();
            if (testClass instanceof com.automation.base.BaseTest) {
                com.automation.base.BaseTest baseTest = (com.automation.base.BaseTest) testClass;
                String screenshot = WebElementUtils.takeScreenshot(baseTest.getDriver());
                if (screenshot != null) {
                    ExtentReportManager.getTest().addScreenCaptureFromBase64String(screenshot, "Failure Screenshot");
                }
            }
        } catch (Exception e) {
            logger.error("Failed to capture screenshot: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.warn("Test skipped: " + result.getMethod().getMethodName());
        ExtentReportManager.getTest().log(Status.SKIP, "Test skipped: " + result.getThrowable().getMessage());
    }
}