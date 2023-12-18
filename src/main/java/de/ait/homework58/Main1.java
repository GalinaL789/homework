package de.ait.homework58;

public class Main1 {

    public static void main(String[] args) {
        // Создаем экземпляры класса Task с разными сообщениями
        Task1 task1 = new Task1("Задача 1 выполнена");
        Task1 task2 = new Task1("Задача 2 выполнена");
        Task1 task3 = new Task1("Задача 3 выполнена");

        // Создаем объекты Thread, передавая в конструктор соответствующие экземпляры Task
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        // Запускаем потоки
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

