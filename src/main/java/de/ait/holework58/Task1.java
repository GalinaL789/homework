package de.ait.holework58;

public class Task1 implements Runnable {
    private String message;

    // Конструктор, принимающий строковый параметр
    public Task1(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        // Выводим переданное сообщение
        System.out.println(message + " - Задача выполнена");
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса Task с передачей строки в конструктор
        Task1 task = new Task1("Привет, мир!");

        // Создаем объект Thread, передавая ему экземпляр Task
        Thread thread = new Thread(task);

        // Запускаем поток
        thread.start();
    }
}

