package de.ait.homework56;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Используем поток данных для фильтрации четных чисел и их вывода на экран
        numbers.stream()
                .filter(n -> n % 2 == 0) // Лямбда-выражение для фильтрации четных чисел
                .forEach(System.out::println); // Вывод на экран

        // Или можно сохранить результат фильтрации в новом списке
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList(); // В Java 16 и выше

        // Вывод на экран нового списка
        System.out.println("Четные числа: " + evenNumbers);
    }
}

