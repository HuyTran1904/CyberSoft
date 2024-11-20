package baitap4;

import java.util.List;

public class Book {
    private String title;
    private String author;
    private String status;
    private List<Library> books;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.status = "có sẵn";
    }

    public String getAuthor() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void borrow() {
        if (status.equals("có sẵn")) {
            status = "đã mượn";
            System.out.println("Bạn đã mượn sách: " + title);
        } else {
            System.out.println("Sách '" + title + "' hiện đã được mượn.");
        }
    }

    public void returnBook() {
        if (status.equals("đã mượn")) {
            status = "có sẵn";
            System.out.println("Bạn đã trả sách: " + title);
        } else {
            System.out.println("Sách '" + title + "' không được mượn nên không thể trả.");
        }
    }
}
