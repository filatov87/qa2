package HW_5_article_compare;

import Pages.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebElement;


import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FiveArticleCompare {


    private BaseFunc baseFunc = new BaseFunc();
    private BaseFunc baseFuncMobile = new BaseFunc();
    private final static String HOMEPAGE = "http://www.delfi.lv";
    private final static String HOMEPAGEMOBILE = "http://m.delfi.lv";
    private static final Logger LOGGER = LogManager.getLogger(FirstTestPages.class);

    @Test
    public void articleTitleSearch() {
//      Open main page of the Web version
        baseFunc.goToUrl(HOMEPAGE);
        HomePage homePage = new HomePage(baseFunc);

//       Open main page of the Mobile version
        baseFuncMobile.goToUrl(HOMEPAGEMOBILE);
        HomePageMobile homePageMobile = new HomePageMobile(baseFuncMobile);


//       Find all titles and add them to a list
        List<WebElement> articleTitles = homePage.getAllTitles();
        List<WebElement> articleTitlesMobile = homePageMobile.getAllTitles();


//       Check if list is not empty
        assertFalse("Title list is empty for the web version", articleTitles.isEmpty());
        assertFalse("Title list is empty for the mobile version", articleTitlesMobile.isEmpty());

        ArticlePage articlePage = homePage.goToFirstArticle();
        ArticlePageMobile articlePageMobile = homePageMobile.goToFirstArticle();

    }

    @Test
    public void getFirstArticles() {
//            Open main page web version
        baseFunc.goToUrl(HOMEPAGE);
        HomePage homePage = new HomePage(baseFunc);

//            Open main page mobile version
        baseFuncMobile.goToUrl(HOMEPAGEMOBILE);
        HomePageMobile homePageMobile = new HomePageMobile(baseFuncMobile);

//            Select some first Articles from list of the web
        List<Article> articlesWeb = homePage.getSomeArticles(5);

//            Select some first Title from list of the mobile
        List<Article> articlesMobile = homePageMobile.getSomeArticles(5);

//            Compare Titles for the web and mobile

        for (int i = 0; i < articlesWeb.size(); i++) {
            assertEquals("Title is not equal for " + i + " article.", articlesWeb.get(i).getTitle().toString(), articlesMobile.get(i).getTitle().toString());
        }

    }

    //            Close browser windows
    public void closeBrowser() {
//       Close Browser window
        baseFunc.closerBrowser();
        baseFuncMobile.closerBrowser();
    }
}
