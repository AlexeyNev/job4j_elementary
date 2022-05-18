package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul = mul * a;
        }
        return mul;
    }
}
