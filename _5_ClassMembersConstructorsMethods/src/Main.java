/**
 * Домашнее задание ClassMembersConstructorsMethods
 *
 * 1.     Создать класс Calculator(Калькулятор) для выполнения основных арифметических операций. Он содержит два поля: a и b.
 *
 * 2.     Написать методы вычисления суммы, разности, произведения и частного. Методы суммы и разности принимают входные параметры a и b
 * и возвращают результат соответствующих операций. Методы произведения и частного необходимо написать с типом возвращаемого значения void (ничего не возвращают)
 * и результат этих операций внутри метода выводится в консоль методом System.out.println().
 */

public class Main {
    public static void Calculator(double a, char opc, double b) {
        if (opc=='+') System.out.println(a+b);
        if (opc=='*') System.out.println(a*b);
        if (opc=='-') System.out.println(a-b);
        if (opc=='/') System.out.println(a/b);
    }

    public static void main(String[] args) {
//Калькулятор через операцию
        Calculator(6,'+',5);

        System.out.println("---------Задание 1");

        System.out.println(Calculator.add(5,6));
        System.out.println(Calculator.divide(5,1));

        System.out.println("---------Задание 2");
        Calculator.add2(5,6);
        Calculator.multiply2(5,6);
        Calculator.divide2(5,5);
    }
}