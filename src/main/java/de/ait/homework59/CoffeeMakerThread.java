package de.ait.homework59;

public class CoffeeMakerThread extends Thread {

    public void run() {
        grindCoffee();
        brewCoffee();
        coffeeIsReady();
    }

    private void grindCoffee() {
        System.out.println("Кофе мелется");
        try {
            Thread.sleep(2000); // Задержка в 2 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void brewCoffee() {
        System.out.println("Кофе заваривается");
        try {
            Thread.sleep(500); // Задержка в 0.5 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void coffeeIsReady() {
        System.out.println("Кофе готов");
        // Нет задержки после приготовления
    }

    public static void main(String[] args) {
        CoffeeMakerThread coffeeMaker = new CoffeeMakerThread();
        coffeeMaker.start();
    }
}
