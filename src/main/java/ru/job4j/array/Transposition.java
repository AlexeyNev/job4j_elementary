package ru.job4j.array;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = n * i + j;
            }
        }
        return result;
    }
}