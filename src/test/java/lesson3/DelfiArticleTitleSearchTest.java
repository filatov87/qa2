package lesson3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.*;

public class DelfiArticleTitleSearchTest {
    private static final String TITLE = "Rimإ،ؤ“viؤچam jؤپnoliek pilnvaras, paziإ†o Reizniece-Ozola";
    private static final String MAIN_PAGE_WEB_URL = "http://www.delfi.lv/";
    private static final String MAIN_PAGE_MOBILE_URL = "http://m.delfi.lv/";
    private static final By ARTICLE_TITLE = By.xpath("//a[@class='top2012-title']");

    @Test
    public void articleTitleSearchTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

//       Open main page of the Web version
        driver.get(MAIN_PAGE_WEB_URL);

//       Find all titles and add them to a list
        List<WebElement> articleTitles = driver.findElements(ARTICLE_TITLE);

//       Check if list is not empty
        assertFalse("Title list is empty", articleTitles.isEmpty());

//       Go through a list and getText() from WebElement
        boolean isTitlePresent = false;

        for (WebElement articleTitle : articleTitles) {
//          Compare every String element to TITLE variable
            if (articleTitle.getText().equals(TITLE)) {
//              Exit loop in case if TITLE is present
                isTitlePresent = true;
                break;
            }
        }

//       If we don't find element that matches TITLE - Display message "Article not found"
        assertTrue("Article is not found", isTitlePresent);

//       Open main page of the Mobile version
//       Find all titles and add them to a list
//       Check if list is not empty
//       Go through a list and getText() from WebElement
//       Exit loop in case if TITLE is present
//       Compare every String element to TITLE variable
//       If we don't find element that matches TITLE - Display message "Title not found"
//       Close browser window
    }
}