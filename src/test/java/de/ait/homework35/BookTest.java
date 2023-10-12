package de.ait.homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookTest {
    @BeforeEach
    public void setUp() {
        book = new Book("AA324", "Война и мир", "Толстой");
    }
    @Test
    public void testDefaultConstructor() {
        Book book = new Book("BB2122","Малая земля", "Брежнев");
        assertNotNull(book);
        // Проверьте, что obj создан с ожидаемыми значениями по умолчанию.
    }
    @Test
    public void testParameterizedConstructor() {
        Book book = new Book("CC786", "Некоторое название","Популярный автор");
        assertNotNull(book);
        assertEquals("Некоторое название", book.getTitle());
        assertEquals("CC786", book.getIsbn());
        assertEquals("Популярный автор", book.getAuthor());
    }
    private Book book;



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