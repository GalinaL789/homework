package de.ait.andrei;
import java.util.HashSet;

public class HashSetResizeExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(3); // Изначальная емкость - 3 элемента
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("Initial Capacity: " + set.size()); // Размер, а не емкость
        displayHashes(set);
        set.add("D");
        System.out.println("New Capacity: " + set.size()); // Размер после добавления элемента
        displayHashes(set);
    }
    public static void displayHashes(HashSet<String> set) {
        System.out.println("Element Hashes:");
        for (String element : set) {
            int hash = element.hashCode();
            System.out.println(element + " : " + hash);
        }
    }
}
