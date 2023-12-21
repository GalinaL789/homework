package de.ait.homework59;

public class SommelierThread extends Thread {
    private String wineType;

    public SommelierThread(String wineType) {
        this.wineType = wineType;
    }

    @Override
    public void run() {
        try {
            System.out.println("Выбираю вино");
            Thread.sleep(2000); // Задержка в 2 секунды
            System.out.println("Вино выбрано: " + wineType);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Пример использования SommelierThread
        SommelierThread sommelier1 = new SommelierThread("Белое");
        SommelierThread sommelier2 = new SommelierThread("Красное");

        sommelier1.start();
        sommelier2.start();
    }
}
