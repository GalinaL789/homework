package de.ait.homework57;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aufgabe3 {
    public static void main(String[] args) {
// Создаем список студентов
        List<Student2> students = Arrays.asList(
                new Student2("Иван", "Иванов"),
                new Student2("Петр", "Петров"),
                new Student2("Сидор", "Сидоров")
        );

// Преобразовываем список студентов в список их имен с использованием лямбда-выражения
        List<String> studentNames = students.stream()
                .map(student -> student.getFirstName())
                .collect(Collectors.toList());

// Выводим результат
        System.out.println(studentNames);
    }
}
