package com.automation.pages;

import com.automation.utils.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleSearchResultsPage extends BasePage {

    // Page Elements
    @FindBy(id = "search")
    private WebElement searchResultsContainer;

    @FindBy(xpath = "//div[@id='result-stats']")
    private WebElement resultStats;

    // Locators
    private final By searchResults = By.xpath("//div[@class='g']");
    private final By searchResultTitles = By.xpath("//h3");
    private final By nextPageButton = By.xpath("//a[@id='pnnext']");
    private final By previousPageButton = By.xpath("//a[@id='pnprev']");

    public GoogleSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean areSearchResultsDisplayed() {
        return WebElementUtils.isElementDisplayed(driver, searchResults);
    }

    public int getSearchResultsCount() {
        List<WebElement> results = driver.findElements(searchResults);
        logger.info("Found " + results.size() + " search results");
        return results.size();
    }

    public String getFirstSearchResultTitle() {
        WebElement firstResult = driver.findElements(searchResultTitles).get(0);
        String title = firstResult.getText();
        logger.info("First search result title: " + title);
        return title;
    }

    public void clickFirstSearchResult() {
        WebElementUtils.click(driver, searchResultTitles);
        logger.info("Clicked on first search result");
    }

    public boolean isNextPageButtonDisplayed() {
        return WebElementUtils.isElementDisplayed(driver, nextPageButton);
    }

    public void clickNextPage() {
        if (isNextPageButtonDisplayed()) {
            WebElementUtils.click(driver, nextPageButton);
            logger.info("Clicked on next page button");
        }
    }

    public String getResultStats() {
        return WebElementUtils.getText(driver, By.xpath("//div[@id='result-stats']"));
    }

    public List<WebElement> getAllSearchResults() {
        return driver.findElements(searchResults);
    }
}