package ru.job4j.array;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int regular = 10;
        int extrapay = 15;
        int doublepay = 20;
        int salary = 0;
        for (int i = 0; i < hours.length; i++) {

            salary += switch (i) {

                case 0, 1, 2, 3, 4 -> hours[i] > 8 ? (hours[i] - 8) * extrapay + 8 * regular : hours[i] * regular;

                case 5, 6 -> hours[i] * doublepay;

                default -> 0;
            };

        }

        return salary;

    }

}
