package de.ait.homework40;

import java.util.Map;
import java.util.HashMap;
public class Bar {
    private HashMap<String, Drink> drinksMap;

    public Bar() {
        drinksMap = new HashMap<>();
    }

    public HashMap<String, Drink> getDrinksMap() {
        return drinksMap;
    }

    public boolean addDrink(String id, Drink drink) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        if (drinksMap.containsKey(id)) {
            System.out.println("Такой напиток уже есть");
            return false;
        } else {
            drinksMap.put(id, drink);
            return true;
        }
    }

    public Drink getDrink(String id) {
        return drinksMap.get(id);
    }

    public static void main(String[] args) {
        Bar bar = new Bar();

        // Создаем несколько напитков и добавляем их в бар
        Drink drink1 = new Drink("Champagne", "alcohol", 0.5);
        Drink drink2 = new Drink("Apple Juice", "not alcoholic", 0.3);

        bar.addDrink("1", drink1);
        bar.addDrink("2", drink2);

        System.out.println(bar.getDrink("1").toString());
        System.out.println("---------------------------------");
        // Получаем напитки по ID
        Drink retrievedDrink1 = bar.getDrink("1");
        Drink retrievedDrink2 = bar.getDrink("2");

        // Выводим информацию о напитках
        if (retrievedDrink1 != null) {
            System.out.println("Название: " + retrievedDrink1.getName());
            System.out.println("Тип: " + retrievedDrink1.getType());
            System.out.println("Объем: " + retrievedDrink1.getVolume() + " л");
        }

        if (retrievedDrink2 != null) {
            System.out.println("Название: " + retrievedDrink2.getName());
            System.out.println("Тип: " + retrievedDrink2.getType());
            System.out.println("Объем: " + retrievedDrink2.getVolume() + " л");
        }
    }
}