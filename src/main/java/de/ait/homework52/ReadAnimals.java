package de.ait.homework52;

import java.io.*;
import java.util.ArrayList;
import java.io.FileReader;

public class ReadAnimals {
    public static void main(String[] args) throws IOException {
        //  FileWriter fileWriter = new FileWriter("Animals.txt");
        ArrayList<Animal> allAnimals = new ArrayList<>();
        Animal animal1 = new Animal("Тигр", "млекопитающее", 2);
        Animal animal2 = new Animal("Утка", "водоплавающая", 1);
        allAnimals.add(animal1);
        allAnimals.add(animal2);
        String path="Animals.txt";
        WritetoFile(allAnimals,path);
        String path1="C:/GAL/homeworks/Animals.txt";
        ReadfromFile(path1);
    }
    public static void WritetoFile(ArrayList<Animal> allAnimals,String path) throws IOException
    {
        FileWriter fileWriter = new FileWriter(path);
        for (Animal animals : allAnimals) {
            //System.out.println(animals.getName());
            fileWriter.write(animals.toString() + "\n");
        }
        fileWriter.close();
    }
    public static void ReadfromFile(String path1) throws IOException
    {
        try {
            FileReader fileReader = new FileReader(path1);
            BufferedReader bfReader=new BufferedReader(fileReader);
            String line= "";
            while(line!=null)
            {
                line = bfReader.readLine();
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        // bfReader.close();
    }
}


