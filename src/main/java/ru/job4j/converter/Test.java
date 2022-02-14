package ru.job4j.converter;

public class Test {
    public static void main(String[] args) {
        /*
        Kata.makeNegative(1); // return -1
        Kata.makeNegative(-5); // return -5
        Kata.makeNegative(0); // return 0
         */
        int a = makeNegative(1);
        System.out.println(a);
        a = makeNegative(-5);
        System.out.println(a);
        a = makeNegative(0);
        System.out.println(a);
    }

    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }
}
