package de.ait.lombok;

public class TestStudent {

    static Student studentNumberOne = new Student("Max", "Mueller");

    static StudentLombok studentLombok = new StudentLombok("Anna", "Schmidt");

    public static void main(String[] args) {

        studentNumberOne.setFirstName("Maxim");

        studentLombok.setFirstName("Anna-Maria");

        System.out.println(studentNumberOne.toString());
        System.out.println(studentNumberOne.hashCode());

        System.out.println(studentLombok.toString());
        System.out.println(studentLombok.hashCode());
        studentLombok.getInfo();

    }


}
