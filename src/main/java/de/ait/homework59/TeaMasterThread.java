package de.ait.homework59;

public class TeaMasterThread extends Thread{
    private String teaSort;
    public TeaMasterThread(String teaSort)
    {
        this.teaSort=teaSort;
    }
    @Override
    public void run()
    {
        System.out.println("Я завариваю " +  teaSort +"чай");

        try{
            Thread.sleep(4000);
        }
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        System.out.println(teaSort  + "чай готов");
    }

    public static void main(String[] args) {
        TeaMasterThread greenTeaThread= new TeaMasterThread("зеленый");
        TeaMasterThread blackTeaThread= new TeaMasterThread("черный");
        greenTeaThread.start();
        blackTeaThread.start();
    }
}
