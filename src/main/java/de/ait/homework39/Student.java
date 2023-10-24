package de.ait.homework39;

import java.util.UUID;

public class Student {
    private UUID id;
    private int age;
    private String Name;

    public Student(int age, String name) {
        this.id = UUID.randomUUID();
        this.age = age;
        Name = name;
    }

    public  UUID getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
