package ru.mirea.kabo0222.task3;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = generateArray(4);
        System.out.println("Массив:");
        printArray(array);

        if (isStrictlyIncreasing(array)) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(90) + 10;
        }
        return array;
    }

    private static boolean isStrictlyIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
