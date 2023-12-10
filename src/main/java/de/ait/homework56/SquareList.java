package de.ait.homework56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareList {
    public static void main(String[] args) {
        // Исходный список целых чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Используем лямбда-выражение для преобразования каждого числа в квадрат
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Вывод результатов
        System.out.println("Исходный список: " + numbers);
        System.out.println("Список квадратов: " + squaredNumbers);
    }
}

