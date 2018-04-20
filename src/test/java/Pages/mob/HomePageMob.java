package Pages.mob;

public class HomePageMob {
    public class HomePageMobile {
        BaseFunc baseFunc;
        private final static By ARTICLE = By.xpath(".//div[contains(@class, 'md-mosaic-big') or contains(@class, 'md-mosaic-small')]");
        private final static By ARTICLE_TITLE = By.xpath(".//a[@class = 'md-scrollpos']");
        private final static By COMMCOUNT = By.xpath(".//a[contains(@class, 'commentCount')]");
        private final static By IMG = By.xpath(".//img[@class = 'md-responsive-img']");

        private static final String TITLE = "VID gaļas tirdzniecībā liedz darboties naudas atmazgātāju grupējumam";
        private static final String TYPETITLE = "Mobile Title";
        private static final String TYPEARTICLE = "Web Articles";


        public HomePageMobile(BaseFunc baseFunc) {

            this.baseFunc = baseFunc;
        }

        public List<WebElement> getAllTitles() {
            return baseFunc.getElements(ARTICLE_TITLE, TYPETITLE);
        }

        public ArticlePageMobile goToFirstArticle() {
            Assert.assertTrue("This is no article", !getAllTitles().isEmpty());
            WebElement firstArticle = getAllTitles().get(0);
            firstArticle.click();
            return new ArticlePageMobile(baseFunc);
        }

        private List<WebElement> getAllArticles() {

            return baseFunc.getElements(ARTICLE, TYPEARTICLE);
        }

        public List<Article> getSomeArticles(Integer articleAmount) {

            List<Article> resultMobile = new ArrayList<Article>();
            List<WebElement> articles = getAllArticles();

            for (int i = 0; i < articleAmount; i++) {

                //Create an empty copy of object
                Article article = new Article();

                WebElement element = articles.get(i);

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
                resultMobile.add(article);
            }

            return resultMobile;
        }

        private Integer getCommentCountFromString(WebElement count) {
            return Integer.parseInt(count.getText().substring(1, count.getText().length() - 1));
        }
}
