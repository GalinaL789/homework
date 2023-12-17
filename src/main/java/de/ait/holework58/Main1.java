package de.ait.holework58;

public class Main1 {
    public static void main(String[] args) {
        // Создаем три экземпляра класса Task с разными сообщениями
        Task1 task1 = new Task1("Привет от потока 1");
        Task1 task2 = new Task1("Привет от потока 2");
        Task1 task3 = new Task1("Привет от потока 3");

        // Создаем объекты Thread, передавая им соответствующие экземпляры Task
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        // Запускаем потоки
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

