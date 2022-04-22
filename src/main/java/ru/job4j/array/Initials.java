package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {

        String pattern = "(\\S+\\s)(\\S{1})\\S+\\s(\\S{1})\\S+";
        String str = fio.replaceAll(pattern, "$1$2.$3.");
        System.out.println(str);
        return str;
    }
}
