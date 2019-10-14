import org.w3c.dom.ls.LSOutput;

import static java.lang.Character.isUpperCase;

public class Book {
    String title;
    String author;
    Integer numberOfPages;

    public Book(String title, String author, Integer numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.numberOfPages = 0;
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    String getInitials() {
        var initials = "";
        for (char l : author.toCharArray()) {
            if (isUpperCase(l)) {initials = initials + l;}
        }
        return initials;
    }

    @Override
    public String toString() {
        return  "Title : " + title +
                "\nAuthor : " + author  +
                "\nPages : " + numberOfPages;
    }

    void show() {
        System.out.println(
                "Title : "+title  +
                "\nAuthor : " + author+
                "\nPages : " + numberOfPages
        );
    }

    public void randomMethod() {};

}
