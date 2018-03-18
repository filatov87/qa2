package lesson3;

import Pages.BaseFunc;
import Pages.HomePage;
import junit.framework.Assert;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;


import static junit.framework.Assert.*;

public class DelfiArticelTitleSearchTest {
    private BaseFunc baseFunc = new BaseFunc();

    private static final String TITLE = "Rimšēvičam jānoliek pilnvaras, paziņo Reizniece-Ozola";
    private static final String MAIN_PAGE_WEB_URL = "http://www.delfi.lv";
    private static final String MAIN_PAGE_MOB_URL = "http://m.delfi.lv";
//    private static final By ARTICLE_TITLE = By.xpath("//a[@class='top2012-title']"); // Т.к. это у нас вынесено в HomePage.java
    private static final Logger LOGGER = LogManager.getLogger(DelfiArticelTitleSearchTest.class);

    @Test
    public void articleTitleSearchTest() {
        LOGGER.info("We are starting our tests");
        LOGGER.info("Opening delfi desktop page");


        baseFunc.goToUrl(MAIN_PAGE_WEB_URL);

        HomePage homePage = new HomePage(baseFunc);
//        Find all titles and add them to list

//        Check if list not empty
        assertFalse("Title list is empty", articleTitles.isEmpty());

//        Go through a list and GetText() from WebElement
        boolean isTitlePresent = false;
        for (WebElement articleTitle : articleTitles) {
//  Compare every String element to TITLE variable
            if (articleTitle.getText().equals(TITLE)) {
//        Exit loop in case if TITLE is present
                isTitlePresent = true;
                break;
            }
        }
//        If we don't find element that matches TITLE - Display message "element not found"
        assertTrue("No article found", isTitlePresent);
//        Open main page of Mobile version
//        Find all titles and add them to a list
//        Check if list is not empty
//        Go through a list and getText() from WebElemtn
//        Exit loop in case if TITLE is present
//        If we don't find element that matches TITLE - display message "element not found"

    }


}
