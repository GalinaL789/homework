package de.ait.homework55;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random rand = new Random();
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int n = rand.nextInt(50);
                    array[i][j] = n;
         //           System.out.println(array[i][j]);
                }
            }
            // You need to call; the average method on the class, not an instance of the class
            Array.average(array);
            System.out.println(Array.maximum(array));
            vyvod(array);
        }
        catch(IndexOutOfBoundsException exception)
        {
            System.out.println("The following exception has been thrown: " +
            exception.getMessage());
        }
    }

    // Make the average method static
    public static double average(int array[][]) {
        int sum = 0;
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = array[i][j] + sum;
                number = number + 1;
            }
        }
        // Calculate and print the average
        double average = (double) sum / number;
      System.out.println("Average value od the array is" + average);
        return average;
    }

    public static int maximum(int array[][]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The maximum value of the array:");
        return max;
    }

    public static void vyvod(int array[][]) {
        double sred = average(array);
        System.out.println("The following numbers are bigger than average:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > sred) {
                    System.out.printf("%d  ",array[i][j]);
                }
            }

        }
    }
}


