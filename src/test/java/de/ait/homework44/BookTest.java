package de.ait.homework44;
import de.ait.homework43.BankAccount;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testGetTitle() {
        Book book = new Book("Война и мир", "Толстой");
        assertEquals("Война и мир", book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        Book book = new Book("Война и мир", "Толстой");
        assertEquals("Толстой", book.getAuthor());
    }

    @Test
    public void testToString() {
        Book book = new Book("Test Title", "Test Author");
        String expected = "Book{, title='Test Title', author='Test Author'}";
        assertEquals(expected, book.toString());
    }
}