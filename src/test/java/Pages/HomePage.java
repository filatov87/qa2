package Pages;

import junit.framework.Assert;
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
    public ArticlePage goToFirstArticle() {
        Assert.assertTrue("There are no articles", !getAllTitles().isEmpty());
        WebElement firstArticle = getAllTitles().get(0);
        firstArticle.click();
        return new ArticlePage(baseFunc);
    }
}
