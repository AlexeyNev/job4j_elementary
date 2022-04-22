package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[0] + data[1] == data[2] &&
                    data[3] + data[4] == data[5] &&
                    data[6] + data[7] == data[8]) {
                return true;
            }
        }
        return false;
    }
}







