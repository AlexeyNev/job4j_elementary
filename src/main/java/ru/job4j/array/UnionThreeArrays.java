//package ru.job4j.array;
//
//public class UnionThreeArrays {
//    public static int[] union(int[] left, int[] middle, int[] right) {
//        //1. Считаем кол-во элементов
//        int numElemLeftArray = 2; //кол-во элементов 1го массива = 2 (1ый + последний)
//        int numElemMiddleArray = 0;  //кол-во элементов 2го массива
//        //считаю кол-во элементов MiddleArray
//        int numElemRightArray = 0; //кол-во элементов 3го массива
//        //считаю кол-во элементов RightArray
//        //2. Создаем результирующий массив
//        int rslLength = ... //сумма всех 3х массивов
//        int[] rsl = new int[rslLength];
//        //3. Заполняем массив rsl:
//        //3.1 Элементами массива left
//        //3.2 Элементами массива middle
//        //3.3 Элементами массива right
//
//        return rsl;
//    }
//}
package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[right.length + 1];
        int index = 0;
        result[index] = left[0];
        index++;
        for (int i = 1; i < middle.length; i++) {
            if (i % 2 == 1) {
                result[index] = middle[i];
                index++;
            }
        }
        for (int j = 0; j < right.length; j++) {
            if (j % 2 == 0) {
                result[index] = right[j];
                index++;
            }
        }
        result[index] = left[left.length -1];
        index++;


        return result;
    }
}