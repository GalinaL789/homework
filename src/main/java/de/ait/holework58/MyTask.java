package de.ait.holework58;

public class MyTask implements Runnable {

    @Override
    public void run() {
        try {
            // Выводим числа от 1 до 5 с задержкой 500 миллисекунд между числами
            for (int i = 1; i <= 5; i++) {
                System.out.println("Число: " + i);
                Thread.sleep(500); // Задержка 500 миллисекунд
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса MyTask
        MyTask myTask = new MyTask();

        // Создаем объект Thread, передавая ему экземпляр MyTask
        Thread thread = new Thread(myTask);

        // Запускаем поток
        thread.start();
    }
}
