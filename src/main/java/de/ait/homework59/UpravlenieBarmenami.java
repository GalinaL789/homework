package de.ait.homework59;

public class UpravlenieBarmenami {

    public static void main(String[] args) {

        Barmen barmen1=new Barmen("tee");
        Barmen barmen2=new Barmen("cofee");
        Barmen barmen3=new Barmen("coctails");
        Thread thread1=new Thread(barmen1);
        Thread thread2=new Thread(barmen2);
        Thread thread3=new Thread(barmen3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
