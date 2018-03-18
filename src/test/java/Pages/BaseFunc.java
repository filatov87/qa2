package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseFunc {
    WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        this.driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    public void goToUrl(String url) {
        // проверка есть ли в начале адрес http://
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }
}