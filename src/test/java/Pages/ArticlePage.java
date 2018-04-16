package Pages;

import org.openqa.selenium.By;

public class ArticlePage {
    private BaseFunc baseFunc;
    private static final By FromSelector = By.id("a//[@id='afrom']");

    ArticlePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

}