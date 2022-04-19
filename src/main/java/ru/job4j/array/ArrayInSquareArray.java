package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int count = 0;
        int length = array.length / 2;
        int[][] rsl = new int[length][length];

        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl.length; j++, count++) {
                if (count < array.length) {
                    rsl[i][j] = array[count];
                } else {
                    rsl[i][j] = 0;
                }
            }
        }
        return rsl;
    }
}