package de.ait.homework39;

public class TestStudent {
    public static void main(String[] args) {
        Student student1= new Student(22,"Peter");
        Student student2= new Student(20,"Alex");
        StudentDatabase stdat=new StudentDatabase();
        stdat.addStudent(student1);
        stdat.addStudent(student2);
        stdat.printAllstudents();
        System.out.println("Contains Student1:" +stdat.containsStudent(student1));
        stdat.containsStudent(student1);
        stdat.printAllstudents();
    }
}