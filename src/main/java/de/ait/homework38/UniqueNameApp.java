package de.ait.homework38;

import java.util.Scanner;
import java.util.HashSet;
public class UniqueNameApp {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        HashSet<String> namesList=new HashSet<>();
        System.out.println("Input the name. To stop-input stop");//памятка пользователю
        while (true)
        {
            System.out.println("Input the name");
            String name = scan.nextLine().toUpperCase();//Чтобы сработало если пользователь введет слово "Stop"
            //разными буквами,Stop, илиsTop
            if(name.equals("STOP"))
            {
                break;
            }
            namesList.add(name);
        }
        scan.close();
        System.out.println("Unique names, input by user:");
        for (String name: namesList)
        {
            System.out.println(name);
        }
    }
}