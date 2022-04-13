package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int rsl = a;
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        for (int i = 2; i < array.length; i++) {
            rsl = rsl + array[i - 1];
            array[i] = rsl;
        }
        return array;
    }
}