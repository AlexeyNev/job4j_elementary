package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean result = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        return result;
    }

    public static void main(String[] args) {
        boolean rsl = Triangle.exist(2.0, 2.0, 2.0);
        System.out.println(rsl);
    }
}