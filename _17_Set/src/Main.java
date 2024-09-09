/**
 * 1.  Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
 * Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
 *
 * 2.  Создайте множество целых чисел. Необходимо вывести в консоль все его элементы, которые больше 15 и являются четными.
 * Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2
 */
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Set<String> colors1 = new HashSet<>();
        colors1.add("red");
        colors1.add("blue");
        colors1.add("green");
        colors1.add("yellow");

        Set<String> colors2 = new HashSet<>();
        colors2.add("blue");
        colors2.add("yellow");
        colors2.add("purple");
        colors2.add("orange");

        Set<String> commonColors = SetUtils.findCommonColors(colors1, colors2);
        System.out.println("Общие цвета: " + commonColors);


        System.out.println("Задание 2");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);
        numbers.add(30);
        numbers.add(5);

        for (Integer number : numbers) {
            if (number > 15 && number % 2 == 0) {
                System.out.println("Четное число больше 15: " + number);
            } else {
                System.out.println("Число " + number + " , разделенное на 2: " + ((( (double) number) / 2)));
            }
        }
    }
}