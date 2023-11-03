package de.ait.homework44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryCatalogTest {

    private LibraryCatalog libraryCatalog;

    @BeforeEach
    public void setUp() {
        libraryCatalog = new LibraryCatalog();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Title 1", "Author 1");
        libraryCatalog.addBook(book);
        assertEquals(1, libraryCatalog.getBooks().size());
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book("Title 2", "Author 2");
        libraryCatalog.addBook(book);
        libraryCatalog.removeBook(book);
        assertEquals(0, libraryCatalog.getBooks().size());
    }

    @Test
    public void testFindBooksByAuthor() {
        Book book1 = new Book("Title 3", "Author 3");
        Book book2 = new Book("Title 4", "Author 3");
        libraryCatalog.addBook(book1);
        libraryCatalog.addBook(book2);
        assertEquals(2, libraryCatalog.findBooksByAuthor("Author 3").size());
    }

    @Test
    public void testFindBookByTitle() {
        Book book = new Book("Title 5", "Author 5");
        libraryCatalog.addBook(book);
        Book foundBook = libraryCatalog.findBookByTitle("Title 5");
        assertEquals(book, foundBook);
    }

    @Test
    public void testFindBookByTitleNotFound() {
        Book book = new Book("Title 6", "Author 6");
        libraryCatalog.addBook(book);
        Book foundBook = libraryCatalog.findBookByTitle("Title 7");
        assertNull(foundBook);
    }
}