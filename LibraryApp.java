package de.ait.homework44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
    private ArrayList<Book> books =new ArrayList<>();
    public static LibraryCatalog catalog = new LibraryCatalog();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your option");
        System.out.println("1: add book");
        System.out.println("2:  remove book");
        System.out.println("3: found book according to it title");
        System.out.println("4: output all books");
        System.out.println("0:  exit");
        while (true) {

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Input book title");
                    String title = scanner.nextLine();
                    System.out.println("Input book author");
                    String author = scanner.nextLine();
                    catalog.addBook(new Book(title, author));
                    break;
                case 2:
                    System.out.println("Input title of the book to be deleted");
                    String titleToRemove = scanner.nextLine();
                    Book bookToRemove = catalog.findBookByTitle(titleToRemove);
                    if (bookToRemove != null) {
                        catalog.removeBook(bookToRemove);
                    }
                    break;
                case 3:
                    System.out.println("Input book title for search");
                    String titleToFind = scanner.nextLine();
                    bookToRemove = catalog.findBookByTitle(titleToFind);
                    catalog.findBookByTitle(titleToFind);
                    break;
                case 4:
                    System.out.println("All the books in catalog");
                    for (Book book : catalog.listAllBooks())
                {
                    System.out.println("Название книги" + book.getTitle() + " Автор" + book.getAuthor());
                }
                break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("Error, please input correct number");
            }
        }

    }

}