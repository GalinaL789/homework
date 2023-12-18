package de.ait.homework58;

public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр класса Task
        Task task = new Task();

        // Создаем объект Thread, передавая в конструктор экземпляр Task
        Thread thread = new Thread(task);

        // Запускаем поток
        thread.start();
    }
}

