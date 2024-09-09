/**
 * 1. Напишите метод, который принимает два массива одного типа и проверяет,
 * содержат ли они одинаковые элементы в одном и том же порядке.
  *
 * 2. Напишите универсальный метод, чтобы обмениваться позициями
 * двух различных элементов в массиве.
 * */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        Integer[] array3 = {1, 2, 3, 5, 4};
        System.out.println("Задание 1");
        System.out.println("array1 и array2 равны: " + ArrayUtils.areArraysEqual(array1, array2)); // true
        System.out.println("array1 и array3 равны: " + ArrayUtils.areArraysEqual(array1, array3)); // false
        System.out.println("Задание 2");
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D", "E"};

        System.out.println("До обмена:");
        System.out.println("intArray: " + java.util.Arrays.toString(intArray));
        System.out.println("strArray: " + java.util.Arrays.toString(strArray));

        ArrayUtils.swap(intArray, 1, 3);
        ArrayUtils.swap(strArray, 0, 4);

        System.out.println("После обмена:");
        System.out.println("intArray: " + java.util.Arrays.toString(intArray));
        System.out.println("strArray: " + java.util.Arrays.toString(strArray));
        ArrayUtils.swap(strArray, 0, 15);
    }
}