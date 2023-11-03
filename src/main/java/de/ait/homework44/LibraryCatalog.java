package de.ait.homework44;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LibraryCatalog {
    // все книги
    private ArrayList<Book> books = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryCatalog.class);

    // все читатели

    // Добавление книги
    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
            LOGGER.info("Книга добавлена в каталог: {}", book.getTitle());
        } else {
            LOGGER.error("Попытка добавить нулевую книгу в каталог.");
        }
    }
    // Удаление книги по ID
    public void removeBook(String title) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            LOGGER.info("Книга удалена из каталога: {}", title);
        } else {
            LOGGER.info("Книга с названием {} не найдена в каталоге.", title);
        }
    }

    // Поиск книг по автору
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    public Book findBookByTitle(String title){
        if(books.size()==0)
        {
            LOGGER.info("В каталоге не содержится ни одной книги");
        }
        for(Book book: books){
            if(book.getTitle().equals(title)){
                LOGGER.info("Книга нейдена по названию" + title);
                return book;
            }
        }
        LOGGER.info("Книга не нейдена по названию" + title);
        return null;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public ArrayList<Book> listAllBooks() {
        return books;
    }
}
