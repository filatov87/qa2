package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseFunc {
    public WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public void selectFrom() {
        driver.findElement(By.xpath("//*[@id='afrom']")).click();
        driver.findElement(By.xpath("//*[@value ="RIX"")).click();
    }

    public void selectTo() {
        driver.findElement(By.xpath("//*[@id='bfrom']")).click();
        driver.findElement(By.xpath("//*[@value ="VVO"")).click();
    }
    public void SubmitTicketSearch() {
        driver.findElement(By.xpath("//*[@class='gogogo']")).click();
        }
    public void closeBrowser() {
        driver.quit();
    }
}