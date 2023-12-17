package de.ait.holework58;

public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Задача выполнена");
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса Task
        Task task = new Task();

        // Создаем объект Thread, передавая ему экземпляр Task
        Thread thread = new Thread(task);

        // Запускаем поток
        thread.start();
    }
}
