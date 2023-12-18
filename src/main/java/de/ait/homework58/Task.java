package de.ait.homework58;
//Задача: Создайте класс Task, который реализует
// интерфейс Runnable. В методе run(), должно выводиться
// сообщение "Задача выполнена".
public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Задача выполнена");
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса Task
        Task task = new Task();

        // Создаем объект Thread, передавая в конструктор экземпляр Task
        Thread thread = new Thread(task);

        // Запускаем поток
        thread.start();
    }
}

