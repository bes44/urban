/**
 * Домашнее задание WhileDoWhileForBreakContinue
 *
 * 1.     Вывести в консоль значения диапазона чисел от 1 до 50 кратные 3 с использованием цикла while.
 * 2.     Напишите программу, которая находит сумму всех чисел от 1 до 100 с использованием цикла for.
 */

public class Main {
    public static void main(String[] args) {
        int i=1,sum=0;
        System.out.println("___________задание1");
        while (i<=50)
        {
            if (i%3==0) System.out.println(i);
            i++;
        }
        System.out.println("___________задание2");
        for (i=1;i<101;i++) {
            sum = sum + i;
        }
        System.out.println("sum="+sum);
    }
}