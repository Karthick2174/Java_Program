package com.automation.base;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.automation.utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTest {
    protected WebDriver driver;
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);
    protected ExtentTest test;

    @BeforeSuite
    public void beforeSuite() {
        logger.info("Starting Test Suite Execution");
        ExtentReportManager.initReports();
    }

    @BeforeMethod
    public void setUp(Method method) {
        logger.info("Setting up test: " + method.getName());
        
        // Initialize driver
        String browser = ConfigReader.getProperty("browser");
        driver = DriverManager.getDriver(browser);
        
        // Create extent test
        test = ExtentReportManager.createTest(method.getName());
        
        // Navigate to base URL
        String baseUrl = ConfigReader.getProperty("base.url");
        driver.get(baseUrl);
        logger.info("Navigated to: " + baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            DriverManager.quitDriver();
            logger.info("Driver closed successfully");
        }
    }

    @AfterSuite
    public void afterSuite() {
        ExtentReportManager.flushReports();
        logger.info("Test Suite Execution Completed");
    }

    protected WebDriver getDriver() {
        return driver;
    }
}