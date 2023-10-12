package de.ait.homework35;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

public class BookManagerTest {
    private BookManager bookmanager;

    @BeforeEach
    public void setUp() {
        bookmanager = new BookManager();
    }

    @Test
    public void testaddBook() {
        Book book = new Book("AA324", "The secret Wife", "linda Kavanagh");
        assertNotNull(bookmanager.findBookByISBN("AA324"));
    }
    @Test
    public void testAddBookWithDuplicateISBN()
    {
        Book book1 = new Book("AA325", "Поющие в терновнике", "Колин Маккалоу");
        Book book2 = new Book("AA325", "Гордость и предубеждение", "Джейн Остин");
        bookmanager.addBook(book1);
        try
        {
            bookmanager.addBook(book2);
            fail ("Expected IllegalArgumentException");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Книга уже есть");
        }
    }
    @Test
    public void testFindBookbyISBN()
    {
        Book book=new Book("AA345", "Джейн Эйр", "Шарлота Бронте");
        bookmanager.addBook(book);
        assertEquals(book, bookmanager.findBookByISBN("AA345"));
    }
    @Test
    public void testRemoveBook()
    {
        Book book =new Book("AA435","Войга и мир","Лев Толстой");
        bookmanager.addBook(book);
        assertTrue(bookmanager.removeBook("AA435"));
        assertNull(bookmanager.findBookByISBN("AA435"));
    }

}


