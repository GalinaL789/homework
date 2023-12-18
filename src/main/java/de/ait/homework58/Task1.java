package de.ait.homework58;
public class Task1 implements Runnable {
    private String string;


    // Конструктор, принимающий строковый параметр
    public Task1(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        // Выводим строку, переданную в конструкторе
        System.out.println(string);
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса Task1 с передачей строки в конструктор
        Task1 task = new Task1("Привет Поток");

        // Создаем объект Thread, передавая в конструктор экземпляр Task
        Thread thread = new Thread(task);

        // Запускаем поток
        thread.start();
    }
}



