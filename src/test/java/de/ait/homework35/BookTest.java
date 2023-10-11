package de.ait.homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    private Book book;

    @BeforeEach
    public void setUp() {
        book = new Book("AA324", "Война и мир", "Толстой");
    }

    @Test
    public void testgetIsbn() {
        assertEquals("AA324", book.getIsbn());
    }

    @Test
    public void testsetIsbn() {
        book.setIsbn("AA325");
        assertEquals("AA325", book.getIsbn());
    }

    @Test
    public void testSetTitle() {
        book.setTitle("Поющие в тетрокнике");
        assertEquals("Поющие в тетрокнике", book.getTitle());
    }
}
