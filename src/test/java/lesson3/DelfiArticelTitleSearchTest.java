package lesson3;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static junit.framework.Assert.*;

public class DelfiArticelTitleSearchTest {
    private static final String TITLE = "Rimšēvičam jānoliek pilnvaras, paziņo Reizniece-Ozola";
    private static final String MAIN_PAGE_WEB_URL = "http://www.delfi.lv";
    private static final String MAIN_PAGE_MOB_URL = "http://m.delfi.lv";
    private static final By ARTICLE_TITLE = By.xpath("//a[@class='top2012-title']");

    @Test
    public void articleTitleSearchTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//        don't forget to maximize window
        driver.manage().window().maximize();
//        Open main page of the Web version
        driver.get(MAIN_PAGE_WEB_URL);
//        Find all titles and add them to list
        List<WebElement> articleTitles = driver.findElements(ARTICLE_TITLE);
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
