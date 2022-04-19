package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                if (left[i][j] > right[i][j]) {
                    rsl[count] = left[i][j];
                    count++;
                }
                if (left[i][j] < right[i][j]) {
                    rsl[count] = right[i][j];
                    count++;
                }
            }
        }
        return rsl;
    }
}