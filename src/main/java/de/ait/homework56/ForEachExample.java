package de.ait.homework56;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        // Создаем список целых чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Используем метод forEach с лямбда-выражением для печати каждого элемента списка
        numbers.forEach(number -> System.out.println(number));
    }
}
