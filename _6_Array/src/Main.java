/**
 * Домашнее задание по теме "Array"
 * 1.     Дан массив целых чисел int[] array = {3, 87, 12, 98, 2, 4, 66}.
 *
 * Вывести в консоль элементы массива в обратном порядке, т.е. начиная с 66.
 *
 * 2.     Дан произвольный массив чисел с плавающей точкой. Необходимо отсортировать его по убыванию.
  *
 * 3.     Дан массив целых чисел int[] array = {6, 117, 44, 5, 32, 81, 9}. Необходимо вывести в консоль четные элементы массива.
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        double[] array2 = {5.3, 4.01, 5.5};
        int[] array3 = {6, 117, 44, 5, 32, 81, 9};
        System.out.println("-------Задание1");
        printArray(array);
        System.out.println("Обратный порядок");
        printArray(reverseArray(array));
        System.out.println("-------Задание2");
        printArray(array2);
        System.out.println("Отсортированный массив");
        Arrays.sort(array2);
        printArray(array2);
        System.out.println("-------Задание3");
        printArray(array3);
        System.out.println("Четные элементы массива");
        printArrayChet(array3);
    }

    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
        System.out.println();
    }

    public static void printArrayChet(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if (a[i]%2 == 0)
            System.out.print(a[i] +" ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] a)
    {
        int[] newArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArray[a.length - 1 - i] = a[i];
        }

        return newArray;
    }

    public static void printArray(double a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
        System.out.println();
    }
}