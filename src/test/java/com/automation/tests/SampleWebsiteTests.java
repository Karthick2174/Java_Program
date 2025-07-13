package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.utils.ExtentReportManager;
import com.automation.utils.WebElementUtils;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleWebsiteTests extends BaseTest {

    @Test(description = "Test form submission on sample website")
    public void testFormSubmission() {
        test.log(Status.INFO, "Starting Form Submission Test");
        
        // Navigate to a sample form website
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        
        // Fill out the form
        WebElementUtils.sendKeys(driver, By.id("my-text-id"), "Test User");
        WebElementUtils.sendKeys(driver, By.name("my-password"), "password123");
        WebElementUtils.sendKeys(driver, By.name("my-textarea"), "This is a test message");
        
        // Select dropdown
        WebElementUtils.selectDropdownByText(driver, By.name("my-select"), "Two");
        
        // Submit form
        WebElementUtils.click(driver, By.xpath("//button[@type='submit']"));
        
        // Verify success message
        boolean isSuccessDisplayed = WebElementUtils.isElementDisplayed(driver, 
            By.xpath("//*[contains(text(), 'Received!')]"));
        
        Assert.assertTrue(isSuccessDisplayed, "Form submission was not successful");
        
        test.log(Status.PASS, "Form submitted successfully");
    }

    @Test(description = "Test navigation and page elements")
    public void testPageNavigation() {
        test.log(Status.INFO, "Starting Page Navigation Test");
        
        // Navigate to Selenium website
        driver.get("https://www.selenium.dev/");
        
        // Verify page title
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Selenium"), "Page title doesn't contain 'Selenium'");
        
        // Check if main navigation elements are present
        boolean isDownloadsLinkPresent = WebElementUtils.isElementDisplayed(driver, 
            By.xpath("//a[contains(text(), 'Downloads')]"));
        
        Assert.assertTrue(isDownloadsLinkPresent, "Downloads link is not present");
        
        test.log(Status.PASS, "Page navigation test completed successfully");
    }
}