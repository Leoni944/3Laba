package ru.mirea.kabo0222.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Генерация массива с использованием метода random() класса Math
        double[] array1 = generateArrayWithMathRandom(10);
        System.out.println("Массив с использованием метода random() класса Math:");
        printArray(array1);
        sortArray(array1);
        System.out.println("\n");
        System.out.println("Отсортированный массив:");
        printArray(array1);

        // Генерация массива с использованием класса Random
        double[] array2 = generateArrayWithRandomClass(10);
        System.out.println("\n");
        System.out.println("Массив с использованием класса Random:");
        printArray(array2);
        sortArray(array2);
        System.out.println("\n");
        System.out.println("Отсортированный массив:");
        printArray(array2);
    }

    private static double[] generateArrayWithMathRandom(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private static double[] generateArrayWithRandomClass(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    private static void sortArray(double[] array) {
        Arrays.sort(array);
    }

    private static void printArray(double[] array) {
        for (double element : array) {
            System.out.println(element);
        }
    }
}
