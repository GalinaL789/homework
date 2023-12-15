package de.ait.homework57;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Aufgabe5 {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Студент1", 75.5));
        students.add(new Student1("Студент2", 82.3));
        students.add(new Student1("Студент3", 90.0));
        students.add(new Student1("Студент4", 67.8));

// Находим студента с максимальным средним баллом
        Student1 maxGradeStudent = students.stream()
                .max(Comparator.comparingDouble(Student1::getAverageGrade))
                .orElse(null);

        System.out.println("Студент с максимальным баллом: " + maxGradeStudent.getName());

// Находим студента с минимальным средним баллом
        Student1 minGradeStudent = students.stream()
                .min(Comparator.comparingDouble(Student1::getAverageGrade))
                .orElse(null);

        System.out.println("Студент с минимальным баллом: " + minGradeStudent.getName());
    }
}
