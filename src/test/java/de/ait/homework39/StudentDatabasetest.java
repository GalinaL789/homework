package de.ait.homework39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDatabasetest {
    private StudentDatabase studentDatabase;
    private Student Student1;
    private Student Student2;
    private Student Student3;
    @BeforeEach
    void setUp()
    {
        studentDatabase =new StudentDatabase();
    }
    @Test
    void testAddStudent()
    {
        Student1=new Student(21,"Pavel");
        //Student2=new Student(23, "Anna" );
        //studentDatabase.addStudent(Student1);
        assertTrue(studentDatabase.addStudent(Student1));
        assertFalse(studentDatabase.addStudent(Student1));
        //studentDatabase.addStudent(Student1);
        //Assertions.assertEquals(0,studentDatabase.addStudent(Student1));
    }
    @Test
    void testRemoveStudent()
    {
        Student1=new Student(21,"Pavel");
        Student2=new Student(2,"Anna" );
        studentDatabase.addStudent(Student1);
        studentDatabase.addStudent(Student2);
        Assertions.assertEquals(true,studentDatabase.removeStudent(Student2));
    }
    @Test
    void testPrintAllStudents()
    {
        Set<Student> spisokStudents= new HashSet<>();
        assertEquals(0,studentDatabase.spisokStudents.size());
        Student1=new Student(21,"Pavel");
        Student2=new Student(23, "Anna" );
        studentDatabase.addStudent(Student1);
        studentDatabase.addStudent(Student2);
        Assertions.assertEquals(2, studentDatabase.spisokStudents.size());
    }
    @Test
    void testFindStudentByName() {
        // Проверяем, что список пуст, ожидаем null
        Assertions.assertNull(studentDatabase.findStudentByName("Anna"));
        Student1=new Student(20,"Pavel");
        Student2=new Student(21, "Anna" );
        studentDatabase.addStudent(Student1);
        studentDatabase.addStudent(Student2);

        Student foundStudent = studentDatabase.findStudentByName("Anna");
        // Проверяем, есть ли студент
        Assertions.assertNotNull(foundStudent);
        Assertions.assertEquals("Anna", foundStudent.getName());
        foundStudent = studentDatabase.findStudentByName("John");
        // Проверяем, что студент не найден, ожидаем null
        Assertions.assertNull(foundStudent);
    }
    @Test
    void testGetStudentsInAgeRange() {
        // Проверяем, что список пуст
        Assertions.assertEquals(0, studentDatabase.getStudentCount());
        Student Student1=new Student(20,"Pavel");
        Student Student2=new Student(21, "Anna" );
        Student Student3 =new Student(22,"Emma");
        studentDatabase.addStudent(Student1);
        studentDatabase.addStudent(Student2);
        studentDatabase.addStudent(Student3);
        List<Student> studentsInRange = studentDatabase.getStudentsInAgeRange(20, 21);
        // Проверка нашлись ли 2 студента
        Assertions.assertEquals(2, studentsInRange.size());

        studentsInRange = studentDatabase.getStudentsInAgeRange(24, 26);
        // Список должен  быть пустым
        Assertions.assertTrue(studentsInRange.isEmpty());

        studentsInRange = studentDatabase.getStudentsInAgeRange(20, 22);
        // Проверяем, что вернулось 3 студента
        Assertions.assertEquals(3, studentsInRange.size());
    }
    @Test
    void testgetStudentCount()
    {
        Assertions.assertEquals(0,studentDatabase.getStudentCount());//Проверка списка, что он пуст
        studentDatabase.addStudent(Student1);
        studentDatabase.addStudent(Student3);
        Assertions.assertEquals(2,studentDatabase.getStudentCount());//Проверка списка, что он содержит 3 студениа
    }

    @Test
    void testToString() {
        Student Student1=new Student(20,"Pavel");
        Student Student2=new Student(21, "Anna" );
        studentDatabase.addStudent(Student1);
        studentDatabase.addStudent(Student2);
        String expected = "StudentDatabase{studentsList=[" + Student1.toString() + ", " + Student2.toString() + "]}";
        Assertions.assertEquals(expected, studentDatabase.toString());
    }
}
