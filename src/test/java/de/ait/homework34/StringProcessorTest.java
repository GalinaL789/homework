package de.ait.homework34;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {
    private StringProcessor stringProcessor;
    @BeforeEach
    public void setUp() {
        stringProcessor = new StringProcessor();
    }
    @Test
    @DisplayName("Проверка соединения строк")
    public void testConcatenate() {
        assertEquals("Good Day", stringProcessor.concatenate("Good ", "Day"));
    }
    @Test
    @DisplayName("Checking the length of the String")
    public void testGetLength(){
        assertEquals(6,stringProcessor.getLength("Galina"));
    }
    @Test
    @DisplayName("Check of inverse String")
    public void testReverse(){
        assertEquals("oksaL",stringProcessor.reverse("Lasko"));
    }
    @Test
    @DisplayName("Check polindrome")
    public void testIsPalindrome(){
        assertEquals(true,stringProcessor.isPalindrome("racecar"));
    }

}