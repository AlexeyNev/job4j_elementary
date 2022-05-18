package ru.job4j.loop;

public class OddCount {
    public static int count(int a, int b) {
        int z = 0;
        for (int i = b; i >= a; i--) {
            if (i % 2 == 1) {
                z = z + a;
                System.out.println(z);
            }
        }
        return z;
    }
}
