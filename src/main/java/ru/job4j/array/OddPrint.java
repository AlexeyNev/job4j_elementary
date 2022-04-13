package ru.job4j.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = 1; j < array.length; j++) {
                if (array[i] < min) {
                    min = array[i];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tepm = array[i];
                array[i] = array[min_i];
                array[min_i] = tepm;
            }
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}