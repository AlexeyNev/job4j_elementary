package ru.job4j.array;

public class EvenPrint {
    public static void print(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            for (int i = j; i >= 0; i--) {
                if (j % 2 == 0) {
                    System.out.println(j);
                }
            }

        }


    }
}
