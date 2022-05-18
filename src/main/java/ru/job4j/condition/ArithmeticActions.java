package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (left + right == rsl) {
            return "added";
        } else if (left - right == rsl) {
            return "subtracted";
        } else if (left * right == rsl) {
            return "multiplied";
        } else if (left / right == rsl) {
            return "divided";
        } else {
            return "none";
        }
    }

    public static void main(String[] args) {
        ArithmeticActions.selectAction(5, 10, 15);
        ArithmeticActions.selectAction(10, 5, 5);
        ArithmeticActions.selectAction(3, 5, 15);
        ArithmeticActions.selectAction(15, 5, 3);
        ArithmeticActions.selectAction(1, 10, 100);
    }
}