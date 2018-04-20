package Pages.web;

public class HomePageMob {

    BaseFunc baseFunc;
    private final static By ARTICLE_TITLE = By.xpath(".//a[contains(@class, 'top2012-title')]");
    private final static By ARTICLE = By.className("top2012-big");
    private final static By COMMCOUNT = By.xpath(".//a[contains(@class, 'comment-count')]");
    private final static By IMG = By.xpath(".//div[contains(@class, 'top2012-image')]/img");

    private static final String TITLE = "VID gaļas tirdzniecībā liedz darboties naudas atmazgātāju grupējumam";
    private static final String TYPETITLE = "Web Title";
    private static final String TYPEARTICLE = "Web Articles";


    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public List<WebElement> getAllTitles() {

        return baseFunc.getElements(ARTICLE_TITLE, TYPETITLE);
    }

    public ArticlePage goToFirstArticle() {

        Assert.assertTrue("This is no article", !getAllTitles().isEmpty());
        WebElement firstArticle = getAllTitles().get(0);
        firstArticle.click();
        return new ArticlePage(baseFunc);
    }

    private List<WebElement> getAllArticles() {

        return baseFunc.getElements(ARTICLE, TYPEARTICLE);
    }

    public List<Article> getSomeArticles(Integer articleAmount) {

        List<Article> resultWeb = new ArrayList<Article>();

        for (int i = 0; i < articleAmount; i++) {

            //Create an empty copy of object
            Article article = new Article();

            WebElement element = getAllArticles().get(i);

            //Fill this object
            article.setArticleLink(element.findElement(ARTICLE_TITLE).getAttribute("href"));
            if (element.findElements(COMMCOUNT).isEmpty()) {
                article.setComments(0);
            } else {
                article.setComments(getCommentCountFromString(element.findElement(COMMCOUNT)));
            }
            article.setPhotoLink(element.findElement(IMG).getAttribute("src"));
            article.setTitle(element.findElement(ARTICLE_TITLE).getText());

            //Put filled object to list
            resultWeb.add(article);
        }

        return resultWeb;
    }

    private Integer getCommentCountFromString(WebElement count) {
        return Integer.parseInt(count.getText().substring(1, count.getText().length() - 1));
    }
}
