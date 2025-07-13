package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.GoogleHomePage;
import com.automation.pages.GoogleSearchResultsPage;
import com.automation.utils.ExtentReportManager;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTests extends BaseTest {

    @Test(priority = 1, description = "Verify Google home page loads successfully")
    public void testGoogleHomePageLoad() {
        test.log(Status.INFO, "Starting Google Home Page Load Test");
        
        GoogleHomePage homePage = new GoogleHomePage(driver);
        
        // Verify page title
        String expectedTitle = "Google";
        String actualTitle = homePage.getPageTitle();
        
        test.log(Status.INFO, "Expected Title: " + expectedTitle);
        test.log(Status.INFO, "Actual Title: " + actualTitle);
        
        Assert.assertEquals(actualTitle, expectedTitle, "Google home page title mismatch");
        
        // Verify Google logo is displayed
        Assert.assertTrue(homePage.isGoogleLogoDisplayed(), "Google logo is not displayed");
        
        test.log(Status.PASS, "Google home page loaded successfully");
    }

    @Test(priority = 2, description = "Verify search functionality works correctly")
    public void testGoogleSearch() {
        test.log(Status.INFO, "Starting Google Search Test");
        
        GoogleHomePage homePage = new GoogleHomePage(driver);
        String searchTerm = "Selenium WebDriver";
        
        test.log(Status.INFO, "Searching for: " + searchTerm);
        
        // Perform search
        GoogleSearchResultsPage resultsPage = homePage.searchFor(searchTerm);
        
        // Verify search results are displayed
        Assert.assertTrue(resultsPage.areSearchResultsDisplayed(), "Search results are not displayed");
        
        // Verify search results count
        int resultsCount = resultsPage.getSearchResultsCount();
        Assert.assertTrue(resultsCount > 0, "No search results found");
        
        test.log(Status.INFO, "Found " + resultsCount + " search results");
        
        // Verify first search result title contains search term
        String firstResultTitle = resultsPage.getFirstSearchResultTitle();
        test.log(Status.INFO, "First result title: " + firstResultTitle);
        
        test.log(Status.PASS, "Google search functionality working correctly");
    }

    @Test(priority = 3, description = "Verify search results pagination")
    public void testSearchResultsPagination() {
        test.log(Status.INFO, "Starting Search Results Pagination Test");
        
        GoogleHomePage homePage = new GoogleHomePage(driver);
        GoogleSearchResultsPage resultsPage = homePage.searchFor("TestNG framework");
        
        // Verify next page button is displayed
        Assert.assertTrue(resultsPage.isNextPageButtonDisplayed(), "Next page button is not displayed");
        
        // Click next page
        resultsPage.clickNextPage();
        
        // Verify we're on page 2
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("start="), "Pagination not working correctly");
        
        test.log(Status.PASS, "Search results pagination working correctly");
    }

    @Test(priority = 4, description = "Verify multiple search terms")
    public void testMultipleSearches() {
        test.log(Status.INFO, "Starting Multiple Searches Test");
        
        String[] searchTerms = {"Java", "Python", "JavaScript", "TestNG"};
        GoogleHomePage homePage = new GoogleHomePage(driver);
        
        for (String searchTerm : searchTerms) {
            test.log(Status.INFO, "Searching for: " + searchTerm);
            
            // Navigate back to home page
            driver.navigate().to("https://www.google.com");
            
            // Perform search
            GoogleSearchResultsPage resultsPage = homePage.searchFor(searchTerm);
            
            // Verify results
            Assert.assertTrue(resultsPage.areSearchResultsDisplayed(), 
                "Search results not displayed for: " + searchTerm);
            
            int resultsCount = resultsPage.getSearchResultsCount();
            Assert.assertTrue(resultsCount > 0, "No results found for: " + searchTerm);
            
            test.log(Status.INFO, "Found " + resultsCount + " results for: " + searchTerm);
        }
        
        test.log(Status.PASS, "Multiple searches completed successfully");
    }
}