package model;

public class Article {
    private String title;
    private Integer commentCount;
    private String photoLink;
    private String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public void setCommentCount(String commentCount) {
//        Как отбрасывать скобки? Предположим, что у нас commentCount = (36)
       // commentCount = commentCount.substring(1); //считаем со второго символа, т.е. отбрасываем первый символ
       // commentCount = commentCount.substring(0, commentCount.length()-1); // отбрасываем последний символ
        commentCount = commentCount.substring(1, commentCount.length()-1); // отбрасываем первый и последний символ. Т.е. показываем только второй и предпослений символы
        this.commentCount = Integer.valueOf(commentCount);
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
