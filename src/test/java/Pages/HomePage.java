package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    BaseFunc baseFunc;
    private static final By ARTICLE_TITLE = By.xpath("//a[@class='top2012-title']");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public List<WebElement> getAllTitles() {
        return baseFunc.getElements(ARTICLE_TITLE);
    }
}
