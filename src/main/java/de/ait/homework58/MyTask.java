package de.ait.homework58;

public class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                // Приостанавливаем выполнение потока на 500 миллисекунд
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса MyTask
        MyTask myTask = new MyTask();

        // Создаем поток для выполнения задачи
        Thread thread = new Thread(myTask);

        // Запускаем поток
        thread.start();
    }
}

