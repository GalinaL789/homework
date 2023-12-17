package de.ait.holework58;

public class MyTask2 {
    public static void main(String[] args) {
        // Создаем два экземпляра класса MyTask
        MyTask myTask1 = new MyTask();
        MyTask myTask2 = new MyTask();

        // Создаем два объекта Thread, передавая каждому экземпляр MyTask
        Thread thread1 = new Thread(myTask1);
        Thread thread2 = new Thread(myTask2);

        // Запускаем оба потока параллельно
        thread1.start();
        thread2.start();
    }
}

