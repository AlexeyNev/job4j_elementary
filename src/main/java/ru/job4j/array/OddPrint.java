package ru.job4j.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int mix = i;
            int min = array[i];

            for (int j = 1; j < array.length; j++) {
                if (array[i] < min) {
                    min = array[i];
                    mix = j;
                }
            }
            if (i != mix) {
                int tepm = array[i];
                array[i] = array[mix];
                array[mix] = tepm;
            }
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}