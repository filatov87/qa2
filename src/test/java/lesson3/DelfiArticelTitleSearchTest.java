package lesson3;

import Pages.ArticlePage;
import Pages.BaseFunc;
import Pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.peer.SystemTrayPeer;
import java.util.List;


import static java.lang.System.out;
import static junit.framework.Assert.*;
import static org.junit.Assert.assertTrue;

public class DelfiArticelTitleSearchTest {
    private BaseFunc baseFunc = new BaseFunc();
    private static final String TITLE = "Мавроди";
    private static final String MAIN_PAGE_WEB_URL = "http://rus.delfi.lv";
    private static final String MAIN_PAGE_MOB_URL = "http://m.rus.delfi.lv";
    private static final Logger LOGGER = LogManager.getLogger(DelfiArticelTitleSearchTest.class);

    @Test
    public void articleTitleSearchTest() {
        LOGGER.info("We are starting our tests");
        LOGGER.info("Opening delfi desktop page");
//        basefunc - открываем главную страницу
        baseFunc.goToUrl(MAIN_PAGE_WEB_URL);
//        ??
        HomePage homePage = new HomePage(baseFunc);
//        делаем лист со всеми элементами
        LOGGER.info("Listing articles");
        List<WebElement> articleTitles = homePage.getAllTitles();
        assertFalse("Title list is empty", articleTitles.isEmpty());
//   Go through a list and GetText() from WebElement
        boolean isTitlePresent = false;
        for (WebElement articleTitle : articleTitles) {
//  Compare every String element to TITLE variable
            LOGGER.info("Comparing if " + articleTitle.getText() + " contains " + TITLE);
            if (articleTitle.getText().contains(TITLE)) {
//        Exit loop in case if TITLE is present
                isTitlePresent = true;
                break;
            }
        }
//        If we don't find element that matches TITLE - Display message "element not found"
        assertTrue("No article found", isTitlePresent);
//      ???  If we find element that contains TITLE - Display success message "TITLE found in articleTitle")
        baseFunc.closeBrowser();
    }
}


