/**
 *Домашнее задание VariablesDataTypesOperators
 *
 * 1.     Создать переменные следующих типов: int, double, char с произвольными значениями. Создать переменную result типа double, которая будет содержать сумму вышеуказанных переменных.
 * Вывести в консоль переменную result.
 *
 * 2.     Даны переменные a = 5 и b = 12. Создать переменную логического типа check, которая будет содержать результат сравнения переменных a и b. Вывести в консоль переменную check.
  *
 * 3.     Дана переменная a = 6. Необходимо выполнить последовательность операций с переменной a. Сначала прибавить к ней 6, затем вычесть 2, разделить на 5, умножить на 7.
 */

public class Main {
    public static void main(String[] args) {
        int a=5, b =12;
        double d=2.3, result;
        char c='g';
        result = a+d+(double)c;
        System.out.println("Задание 1 result = "+ result);
        boolean check = (a>b) ;
        System.out.println("Задание 2 check = "+ check);
        a=6;
        a=a+6;
        a=a-2;
        a=a/5;
        a=a*7;
        System.out.println("Задание 3 a = "+ a);
    }
}