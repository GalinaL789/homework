package de.ait.homework36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
public class PhoneBookTest {
    private PhoneBook phoneBook;
    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }
    @Test
    @DisplayName("Test adding a valid contact")
    public void testAddValidContact() {
        Contact contact = new Contact("Name", "7232");
        phoneBook.addContact(contact);
        List<Contact> contacts = phoneBook.getContacts();
        // You should find the contact by name and compare its attributes, not the name itself
        Contact foundContact = phoneBook.findContactByName("Name");
        assertEquals("Name", foundContact.getName());
        assertEquals("7232", foundContact.getPhoneNumber());
    }
    //2. testAddDuplicateContact
    //- Создать и добавить объект Contact в Phonebook. -
    // Попробовать добавить другой объект
    //Contact с тем же именем. - Удостовериться,
    // что второй контакт не был добавлен
    @Test
    public void testAddDuplicateContact() {
        Contact contact1 = new Contact("Ivanov", "5642");
        Contact contact2 =new Contact("Petrov","5832");
        phoneBook.addContact(contact1);
       assertEquals(true,phoneBook.addContact(contact2));
    }
    @DisplayName("Checking adding null")
    @Test
    //1.3. testAddNullContact
    //- Попробовать добавить null в Phonebook. -
    // Удостовериться, что контакт не был добавлен.
    public void testAddNullContact()
    {
        Contact contact3=new Contact("null", "null");
        assertEquals(true,phoneBook.addContact(contact3));
    }
    @Test
    // testDeleteExistingContact
//Создать и добавить объект Contact в Phonebook. -
// Удалить этот контакт из Phonebook. -
// Удостовериться, что контакт был успешно удален.
    public void TestDeleteExistingContact()
    {
        Contact contact4=new Contact("Litvinov", "5412");
        phoneBook.addContact(contact4);
        assertEquals(true,phoneBook.deleteContact("Litvinov"));
    }
    //testDeleteNonexistentContact
    //- Попробовать удалить контакт, которого нет в Phonebook. - Удостовериться, что метод
    //возвращает false
    //
    @Test
    public void testDeleteNoneExistingContact()
    {
     assertEquals(false, phoneBook.deleteContact("Wasserman"));
    }
    @Test
    //- Создать и добавить объект Contact в Phonebook.
    //    // - Поиск контакта по имени. - Удостовериться,
    //    //что возвращен правильный контакт.
    //
    public void testFindExistingContact()
    {
        Contact contact5=new Contact("Dobrynin", "777888");
        phoneBook.addContact(contact5);
        assertEquals(contact5,phoneBook.findContactByName("Dobrynin"));
    }

//testFindNonexistentContact
//- Поиск контакта по имени,
// которого нет в Phonebook. -
// Удостовериться, что возвращается null.
@Test
    public void testFindNonexistentContact()
{
assertEquals(null,phoneBook.findContactByName("Angelina Jolie"));
}

}