package com.automation.pages;

import com.automation.utils.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends BasePage {

    // Page Elements using Page Factory
    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@value='Google Search']")
    private WebElement googleSearchButton;

    @FindBy(xpath = "//input[@value=\"I'm Feeling Lucky\"]")
    private WebElement feelingLuckyButton;

    // Locators for dynamic elements
    private final By searchSuggestions = By.xpath("//ul[@role='listbox']//li");
    private final By googleLogo = By.xpath("//img[@alt='Google']");

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchTerm(String searchTerm) {
        WebElementUtils.sendKeys(driver, By.name("q"), searchTerm);
        logger.info("Entered search term: " + searchTerm);
    }

    public GoogleSearchResultsPage clickSearchButton() {
        WebElementUtils.click(driver, By.name("btnK"));
        logger.info("Clicked on Google Search button");
        return new GoogleSearchResultsPage(driver);
    }

    public void clickFeelingLuckyButton() {
        WebElementUtils.click(driver, By.xpath("//input[@value=\"I'm Feeling Lucky\"]"));
        logger.info("Clicked on I'm Feeling Lucky button");
    }

    public boolean isGoogleLogoDisplayed() {
        return WebElementUtils.isElementDisplayed(driver, googleLogo);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public GoogleSearchResultsPage searchFor(String searchTerm) {
        enterSearchTerm(searchTerm);
        return clickSearchButton();
    }
}