package OP_basic_checkout_CC;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class guest_checkout_CC {
    public static final String HOME_PAGE = "https://www.opticsplanet.com";
    public static final String SKU_SEARCH = "BU-RS-BNTXTRS-752104";
    public static final String MPN_SEARCH = "432060";
    public static final String USER_MAIL = "alexey.filatov@intexsys.lv";


    @Test
    public void guest_subscription()    {
        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
        WebElement subscription_footer = driver.findElement(By.id("newsletter-input"));
        subscription_footer.sendKeys(USER_MAIL);
        WebElement subscribe_btn = driver.findElement(By.id("email-subscribe-button"));
        subscribe_btn.click();



        driver.quit();
    }
}
