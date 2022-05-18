package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int mul = 1;
        for (int i = a; i <= b; i++) {
            mul = mul * i;
        }
        return mul;
    }
}