package de.ait.homework57;

import java.util.ArrayList;
import java.util.List;
public class StudentFilter {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Ivan", 1.5));
        students.add(new Student1("Maria", 3.8));
        students.add(new Student1("Petr", 4.2));
        students.add(new Student1("Olga", 3.5));

        double threshold = 4.0;

// Используем лямбда-выражение для фильтрации списка студентов
        List<Student1> highPerformingStudents = students.stream().filter(s ->s.getAverageGrade() > threshold ).toList();
        System.out.println(highPerformingStudents);

// Выводим результат
        System.out.println("Студенты сo средним баллом выше " + threshold + ":");
        for (Student1 student : highPerformingStudents) {
            System.out.println(student.getName() + " - " + student.getAverageGrade());
        }
    }

    // Метод для фильтрации студентов с использованием лямбда-выражения
    private static List<Student1> filterStudents(List<Student1> students, StudentFilterPredicate predicate) {
        List<Student1> result = new ArrayList<>();
        for (Student1 student : students) {
            if (predicate.test(student)) {
                result.add(student);
            }
        }
        return result;
    }

    // Функциональный интерфейс для предиката фильтрации
    @FunctionalInterface
    interface StudentFilterPredicate {
        boolean test(Student1 student);
    }
}
