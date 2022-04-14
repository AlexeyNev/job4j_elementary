package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] rsl = data[dst];
        data[dst] = data[src];
        data[src] = rsl;
    }
}
