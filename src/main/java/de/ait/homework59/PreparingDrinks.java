package de.ait.homework59;

public class PreparingDrinks {
    public static void main(String[] args) {
        BartenderThread bartenderThread=new BartenderThread();
        bartenderThread.start();
        CoffeeMakerThread coffeeMakerThread=new CoffeeMakerThread();
        coffeeMakerThread.start();
        SommelierThread whitesommelierThread=new SommelierThread("Белое");
        whitesommelierThread.start();
        SommelierThread redsommelierThread=new SommelierThread("Красное");
        redsommelierThread.start();

    }
}
