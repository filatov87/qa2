package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.*;

public class BaseFunc {
    WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.gecko.driver", "/Users/alex/Downloads/geckodriver");
        this.driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url) {
        if (!url.contains ("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }

        driver.get(url);
    }

    public List<WebElement> getElements(By locator, String list) {
        assertFalse(list + " List is empty", driver.findElements(locator).isEmpty());
        return driver.findElements(locator);
    }

    public void closerBrowser() {
        driver.quit();
    }
}
