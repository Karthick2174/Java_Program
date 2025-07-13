package com.automation.pages;

import com.automation.utils.WebElementUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;
    protected static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void refreshPage() {
        driver.navigate().refresh();
        logger.info("Page refreshed");
    }

    public void navigateBack() {
        driver.navigate().back();
        logger.info("Navigated back");
    }

    public String takeScreenshot() {
        return WebElementUtils.takeScreenshot(driver);
    }
}