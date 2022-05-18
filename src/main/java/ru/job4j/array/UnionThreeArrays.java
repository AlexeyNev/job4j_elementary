package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[right.length + 1];
        int index = 0;
        result[index] = left[0];
        index++;
        for (int i = 1; i < middle.length; i++) {
            if (i % 2 == 1) {
                result[index] = middle[i];
                index++;
            }
        }
        for (int j = 0; j < right.length; j++) {
            if (j % 2 == 0) {
                result[index] = right[j];
                index++;
            }
        }
        result[index] = left[left.length - 1];
        index++;
        return result;
    }
}