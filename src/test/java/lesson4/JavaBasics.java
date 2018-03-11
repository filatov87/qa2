package lesson4;

import Model.Article;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class JavaBasics {

    private static final String MAIN_PAGE_WEB_URL = "http://rus.delfi.lv";
    private static final By ARTICLE = By.className("top2012-big");
    private static final By TITLE = By.xpath(".//a[contains(@class,'top2012-title')]");
    private static final By COMMENTS = By.xpath(".//a[contains(@class,'comment-count')]");

        @Test
    public void firstFiveArticlesTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(MAIN_PAGE_WEB_URL);
        List<WebElement> articles = driver.findElements(ARTICLE);

        List<Article> firstFive = new ArrayList<Article>();

        for (int i=0; i <5; i++) {
            Article a = new Article();
            WebElement we = articles.get(i);
            a.setTitle(we.findElement(TITLE).getText());
            a.setCommentCount(we.findElement(COMMENTS).getText());
            a.setLink(we.findElement(TITLE).getAttribute("href"));
        }
        }
}
