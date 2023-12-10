package de.ait.homework56;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        // Создаем список строк
        List<String> stringList = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");

        // Используем Stream API и метод filter для фильтрации строк, начинающихся с буквы "А"
        List<String> filteredList = stringList.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        // Выводим отфильтрованный список на экран
        System.out.println("Строки, начинающиеся с буквы 'А': " + filteredList);
    }
}

