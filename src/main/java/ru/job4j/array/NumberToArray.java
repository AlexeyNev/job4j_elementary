package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        int[] rsl = new int[number];

        for (int i = 0; i < number; i++) {
            rsl[i] = number % 10;
            number /= 10;
        }
        return rsl;
    }
}