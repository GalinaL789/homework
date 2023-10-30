package de.ait.homework42;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SportsManTest {
    private SportsMan sportsMan;
    @BeforeEach
    void setUp() {
        sportsMan=new SportsMan("Один спортсмен","прыжки в длину",  32, 7);
    }
    @Test
    public void testCreateSportsman()
    {
        SportsMan sportsMan =new SportsMan("Один спортсмен","прыжки в длину",  32, 7);
        assertEquals("Один спортсмен", sportsMan.getName());
        assertEquals("прыжки в длину", sportsMan.getSport());
        assertEquals(32, sportsMan.getAge());
        assertEquals(7, sportsMan.getRecord());
    }

    @Test
    void setName() {
        assertEquals("Один спортсмен",sportsMan.getName());
    }

    @Test
    void setSport() {
        assertEquals("прыжки в длину",sportsMan.getSport());
    }

    @Test
    void testToString() {
        String expected="SportsMan{" +
                "name='" + sportsMan.getName() + '\'' +
                ", sport='" + sportsMan.getSport() + '\'' +
                ", age=" + sportsMan.getAge() +
                ", record=" + sportsMan.getRecord() +
                '}';
        System.out.println(expected);
        System.out.println(sportsMan.toString());
        assertEquals(expected,sportsMan.toString());
    }

    @Test
    void setAge() {
        sportsMan.setAge(33);
        assertEquals(33, sportsMan.getAge());
    }

    @Test
    void setRecordMore() {
        sportsMan.setRecord(10);
        assertEquals(10, sportsMan.getRecord());
    }

    @Test
    void updateRecordMore() //проверяем если спортсмен достигнет большего рекорджа
    {
        sportsMan=new SportsMan("Один спортсмен","прыжки в лдину",  32, 7);
        sportsMan.updateRecord(10);
        assertEquals(10,sportsMan.getRecord());
    }
    @Test
    void updateRecordLess() //провнряем если спортсмен достигнет меньшего рекорда
    {
        sportsMan = new SportsMan("Один спортсмен", "прыжки в лдину", 32, 7);
        sportsMan.updateRecord(5);
        assertEquals(7, sportsMan.getRecord());
    }
    @Test
    void getAge() {
        sportsMan.setAge(42);
        assertEquals(42, sportsMan.getAge());
    }

    @Test
    void getRecord() {
        sportsMan.setRecord(12);
        assertEquals(12, sportsMan.getRecord());
    }
}