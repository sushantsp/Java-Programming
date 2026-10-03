package model;

public class Comment {
    private String text;
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }
}
