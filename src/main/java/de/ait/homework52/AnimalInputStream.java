package de.ait.homework52;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class AnimalInputStream {
    private static String path="animals.obj";

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            ArrayList<Animal> allAnimals= (ArrayList<Animal>) objectInputStream.readObject();
            for (Animal animals : allAnimals) {
                System.out.println(animals.toString());
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Файл "+path+ "не найден или не создан"+ exception.getMessage());

        } catch (IOException exception) {
            System.out.println("Ошибка в обработке данных"+ exception.getMessage());

        } catch (ClassNotFoundException exception) {
            System.out.println("Ошибка в поиску класса для десериализации"+ exception.getMessage());
        }
    }
}

