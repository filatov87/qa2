package Domashka_5_article_delfi;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ListIterator;

public class HW_compare_5_articles_delfi {


    private String HOME_PAGE = "http://rus.delfi.lv";
    private String MOBILE_PAGE = "http://m.rus.delfi.lv";
    private static final By ARTICLE_TITLE = By.xpath("//a[@class='top2012-title']");
    private static final By COMMENT_COUNT = By.xpath("//a[@class='comment-count']");
    private static final By ART_AND_COM = By.xpath("//a[@class ='top2012-title']/..//a[@class='comment-count']");

    @Test
    public void Compare_5_titles() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
//        объявили что драйвер = ФФ
        WebDriver driver = new FirefoxDriver();
//        увеличили окно
        driver.manage().window().maximize();
//        открыли глав.страницу
        driver.get(HOME_PAGE);
//        выводим все элементы класса в лист
        List<WebElement> Articles = driver.findElements(ARTICLE_TITLE);
//       List<Articles>

    }
}


