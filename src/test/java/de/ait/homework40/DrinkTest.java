package de.ait.homework40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DrinkTest {
    private Drink drink;
    @BeforeEach
    public void setUP()
    {
        drink=new Drink("Orange juice","not alcohol",0.5);
    }
    @Test
    void checkPresenceNameTest()
    {
        assertThrows(IllegalArgumentException.class,()-> new Drink(null, "alcohol",0.3));
    }
    @Test
    void checkVolumeTest()
    {
        assertThrows(IllegalArgumentException.class,()-> new Drink("Vodka", "alcohol",-0.3));
    }
    @Test
    void checkfieldTest(){
        Drink drink=new Drink("Orange juice","not alcohol",0.5);
        assertEquals("Orange juice",drink.getName());
        assertEquals("not alcohol",drink.getType());
        assertEquals(0.5,drink.getVolume());
    }

}
