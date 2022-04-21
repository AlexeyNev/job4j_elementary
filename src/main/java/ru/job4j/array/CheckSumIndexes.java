package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] rsl = new int[0];
        int rslCount = 0;
        for (int i = 0; i < data.length; i++) {
            for (int f = 0; f < data[i].length; f++) {
                if (i + f == sum) {
                    data[i][f] = 0;
                } else {
                    rsl = Arrays.copyOf(rsl, ++rslCount);
                    rsl[rslCount - 1] = data[i][f];
                }
            }
        }
        return rsl;
    }
}