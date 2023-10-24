package de.ait.homework39;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class StudentDatabase {
    Set<Student> spisokStudents= new HashSet<>();
    public boolean addStudent(Student student)
    {
        boolean result;
        if(!spisokStudents.contains(student))
        {
            spisokStudents.add(student);
            result=true;
        }
        else {
            // System.out.println("Студент с именем" +student.getName()+ "уже есть");
            result=false;
        }
        return result;
    }
    public boolean removeStudent(Student student)
    {
        if(spisokStudents.contains(student))
        {
            spisokStudents.remove(student);
            return true;
        }
        else{
            System.out.println("Студент с именем"+ student.getName()+"не найден для удаления");
            return false;
        }
    }
    public boolean containsStudent(Student student)
    {
        boolean result=false;
        if(spisokStudents.contains(student))
        {
            result= true;
        }
        return result;
    }
    @Override
    public String toString() {
        return "StudentDatabase{" +
                "studentsList=" + spisokStudents +
                '}';
    }
    public void printAllstudents() {
        if (spisokStudents.isEmpty()) {
            System.out.println("Список студентов пуст");
        } else {
            for (Student student : spisokStudents) {
                System.out.println(student.toString());
            }
        }
    }
    public Student findStudentByName(String name) {
        if (spisokStudents.isEmpty()) {
            return null;
        } else {
            for (Student student : spisokStudents) {
                if (student.getName().equals(name)) {
                    return student;// Возвращаем студента, если имя совпадает
                }
            }
            return null; // Возвращаем null, если не найден студент с указанным именем
        }
    }
    public List<Student> getStudentsInAgeRange(int minAge, int maxAge) {
        List<Student> studentsInAgeRange = new ArrayList<>();
        for (Student student : spisokStudents) {
            int age = student.getAge();
            if (age >= minAge && age <= maxAge) {
                studentsInAgeRange.add(student);
            }
        }
        if (studentsInAgeRange.isEmpty()) {
            System.out.println("Список студентов в указанном возрастном диапазоне пуст.");
        } else {
            System.out.println("Список студентов в указанном возрастном диапазоне:");
            for (Student student : studentsInAgeRange) {
                System.out.println(student);
            }
        }
        return studentsInAgeRange;
    }
    public int getStudentCount() {
        int res;
        if(spisokStudents.isEmpty())
        {
            return 0;
        }
        else {
            res =spisokStudents.size();
        }
        return res;
    }
}
