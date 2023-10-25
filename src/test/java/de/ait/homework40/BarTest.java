package de.ait.homework40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
public class BarTest {
    private Drink drink1;
    private HashMap <String, Drink> drinksMap;
    @BeforeEach
    public void setUP()
    {
        drink1=new Drink("Orange juice","not alcohol",0.5);
        drinksMap=new HashMap<>();
    }
    @Test
    void addDrinkTest()
    {
        drinksMap.put("1",drink1);
        assertEquals(drinksMap.get("1"), drink1);//проверяем добавился ли напиток в HashMap
        assertEquals(1,drinksMap.size());//прверка добавился ли напиток с тем же id
    }

    @Test
    void getDrinkTest()
    {
        drinksMap.put("1",drink1);
        assertEquals(drink1,drinksMap.get("1"));
    }


}