package de.ait.homework45;
import java.util.Scanner;
import java.util.Arrays;
public class Retrieve {
    private static String[] books = {"Apple", "Pear", "Plum", "Orange", "Grape"};

    // Создайте массив строк с различными значениями (минимум 5 элементов).
    //Запросите у пользователя индекс элемента, который нужно извлечь из массива.
    // Напишите метод для безопасного извлечения элемента из массива по индексу.
    // Если извлечение прошло успешно, выведите элемент массива.
    // Используйте блок try-catch для обработки исключений
    //  Обработайте следующие типы исключений
    // ArrayIndexOutOfBoundsException - если пользователь вводит
    // индекс, который выходит за пределы массива
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input index of array");
        String number = scanner.next();

        while (!safeMethod(number, books)){
            System.out.println("Please, try once more");
            number = scanner.next();
        }
    }
    public String[] getBooks() {
        return books;
    }

    private static boolean safeMethod(String number, String[] books) {
        System.out.println("Номер: " + number);
        try {
            int i = Integer.parseInt(number);
            System.out.println("Element of the array with index " + i + " equal: " + books[i]);
            System.out.println();
            return true;
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Index is out of bounds");
        } catch (NumberFormatException exception) {
            System.out.println("Input index has wrong format");
        } finally {
            // В блоке finally выведите сообщение о том, что операция поиска завершена
            System.out.println("Thanks, the manipulations with index comes to the end");
        }
        return  false;
    }
}
