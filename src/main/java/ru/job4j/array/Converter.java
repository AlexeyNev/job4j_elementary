package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            sum += ints.length;
        }
        int n = (int) Math.ceil(Math.sqrt(sum));
        int[][] result = new int[n][n];
        int k = 0;
        int[] rsl = new int[sum];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sum; j++) {
                while (k < n) {
                    rsl[k++] = array[i][j];
                }
                while (k >= n && k < sum) {
                    rsl[k++] = array[j + 1][i + 1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sum; j++) {
                while (k < sum) {
                    result[i][j] = rsl[k++];
                }
            }
        }
        return result;
    }
}
