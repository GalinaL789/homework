package de.ait.homework59;

public class Barmen implements Runnable{
    public String napitok;
    public Barmen(String napitok)
    {
        this.napitok=napitok;
    }
    @Override
    public void run() {
        System.out.println("Я готовлю " + napitok);

        try {
            // Задержка в 3 секунды
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(napitok +"готов");
    }
}
