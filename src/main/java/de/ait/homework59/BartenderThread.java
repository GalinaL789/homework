package de.ait.homework59;

public class BartenderThread extends Thread {

    @Override
    public void run() {
        System.out.println("Готовлю напиток");

        try {
            // Задержка в 3 секунды
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Напиток готов");
    }


    public static void main(String[] args) {
        BartenderThread bartenderThread = new BartenderThread();
        bartenderThread.start();
    }
}

