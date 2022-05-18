package ru.job4j.loop;

public class PrintNTo0 {
    public static void out(int n) {
        for (int i = --n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
