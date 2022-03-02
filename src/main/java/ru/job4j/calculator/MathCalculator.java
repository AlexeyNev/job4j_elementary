package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }
    public static double subAndMult(double first, double second) {
        return sub(first, second)
                + mult(first, second);
    }
    public static double sumAndMultiplyAndSubAndMult(double first, double second) {
        return
                sum(first, second) + multiply(first, second) + sub(first, second) + mult(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndMult(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubAndMult(10, 20));
    }
}