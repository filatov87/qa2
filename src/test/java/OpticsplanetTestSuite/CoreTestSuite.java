package OpticsplanetTestSuite;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class CoreTestSuite {
    private static final Logger LOGGER = LogManager.getLogger(CoreTestSuite.class);
    private String HOME_PAGE = "https://www.opticsplanet.com";
    private String TEST_EMAIL = "alexey.filatov@intexsys.lv";
    private String TEST_PASSWORD = "qwerty";


    @Test //should be executed only once to create new customer
    public void openHomepage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        LOGGER.info("Opening homepage");
        driver.get(HOME_PAGE);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.close();


    }
}

