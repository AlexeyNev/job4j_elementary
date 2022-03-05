package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int oneMax(int left, int right) {
        int result = left < right ? right : left;
        return result;
    }

    public static int equals(int left, int right) {
        int result = left == right ? right : left;
        return result;
    }

    public static void main(String[] args) {
        int s = Max.max(2, 1);
        System.out.println(s);
        int d = Max.oneMax(1, 2);
        System.out.println(d);
        int f = Max.equals(2, 4);
        System.out.println(f);
    }
}