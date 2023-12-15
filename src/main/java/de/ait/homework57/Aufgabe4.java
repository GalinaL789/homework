package de.ait.homework57;

import java.util.ArrayList;
import java.util.List;
public class Aufgabe4 {
    public static void main(String[] args) {
        List<Student3> students = new ArrayList<>();
        students.add(new Student3("Alice", 20));
        students.add(new Student3("Bob", 22));
        students.add(new Student3("Charlie", 19));
        students.add(new Student3("David", 25));

        int targetAge = 21;

// Используем лямбда-выражение для подсчета студентов с возрастом больше заданного
        long count = students.stream().filter(student -> student.age > targetAge).count();

        System.out.println("Количество студентов с возрастом больше " + targetAge + ": " + count);
    }
}

