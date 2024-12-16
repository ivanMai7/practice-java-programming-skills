package xyz.ivan.skills.oop.medium._01;

import java.util.ArrayList;
import java.util.List;

// Design a library management system
// Description:
// Design a Book class with title, author, isbn attributes and a method display_info().
// Design a Library class with a list of books, providing the following functionalities:
// Add a book add_book(book)
// Remove a book remove_book(isbn)
// Search for a book search_by_title(title)

public class Main {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library();

        // Create a new book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Display book information
        book1.displayInfo();
        book2.displayInfo();

        // Search for a book by title
        Book foundBook = library.searchByTitle("1984");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }

        // Remove a book by ISBN
        library.removeBook("1234567890");
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
