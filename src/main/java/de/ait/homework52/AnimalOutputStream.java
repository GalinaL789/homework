package de.ait.homework52;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class AnimalOutputStream {
    private static String path="animals.obj";

    public static void main(String[] args) {
        ArrayList<Animal> allAnimals=new ArrayList<>();
        Animal animal1 = new Animal("Тигр", "млекопитающее", 2);
        Animal animal2 = new Animal("Утка", "водоплавающая", 1);
        allAnimals.add(animal1);
        allAnimals.add(animal2);
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
            outputStream.writeObject(allAnimals);
            outputStream.flush();
        } catch (FileNotFoundException exception) {
            System.out.println("Файл не найден или не создан" + exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

