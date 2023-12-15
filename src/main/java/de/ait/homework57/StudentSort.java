package de.ait.homework57;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class StudentSort {
    public static void main(String[] args) {
        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("Alice", "Doe"));
        studentList.add(new Student2("Rebecca", "Smith"));
        studentList.add(new Student2("John", "Johnson"));

// Сортировка с использованием лямбда-выражения
        Collections.sort(studentList, Comparator.comparing(Student2::getLastName));

// Вывод отсортированного списка
        for (Student2 student : studentList) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        }
    }
}