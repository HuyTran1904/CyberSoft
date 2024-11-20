package baitap4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Danh sách sách có sẵn:");
        boolean hasAvailableBooks = false;
        for (Book book : books) {
            if (book.getStatus().equals("có sẵn")) {
                System.out.println("- " + book.getTitle() + " (Tác giả: " + book.getAuthor() + ")");
                hasAvailableBooks = true;
            }
        }
        if (!hasAvailableBooks) {
            System.out.println("Hiện không có sách nào có sẵn.");
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrow();
                return;
            }
        }
        System.out.println("Không tìm thấy sách có tựa: " + title);
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Không tìm thấy sách có tựa: " + title);
    }
}