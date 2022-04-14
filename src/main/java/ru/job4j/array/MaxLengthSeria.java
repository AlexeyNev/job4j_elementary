package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int max = 1;
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            count = array[i - 1] <= array[i] ? ++count : 1;
            if (count > 1) {
                max = count;
            }
        } return max;
    }
}