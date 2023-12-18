package de.ait.homework58;

public class Aufgabe5 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // Приостанавливаем выполнение потока на 500 миллисекунд
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Создаем два экземпляра класса MyTask
        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();

       // Создаем два потока для выполнения задачи
       Thread thread1 = new Thread(task1);
        System.out.println(thread1.getState());
        Thread thread2 = new Thread(task2);
         System.out.println(thread2.getState());

        // Запускаем оба потока
        thread1.start();
         System.out.println(thread1.getState());
        thread2.start();
         System.out.println(thread2.getState());
    }
}

