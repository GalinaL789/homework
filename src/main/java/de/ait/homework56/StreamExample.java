package de.ait.homework56;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // Исходный список строк
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        // Используем поток для обработки коллекции и преобразования строк в верхний регистр
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase) // Используем метод toUpperCase для преобразования строки в верхний регистр
                .collect(Collectors.toList()); // Собираем результат в список

        // Выводим результат
        System.out.println("Исходные строки: " + strings);
        System.out.println("Строки в верхнем регистре: " + upperCaseStrings);
    }
}
