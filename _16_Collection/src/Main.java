/**
 * 1.   Создайте ArrayList, содержащий разные цвета, тип элемента этого динамического массива – String.
 * Напишите метод для поиска элемента в списке , содержащем эти цвета. На вход метод принимает параметр поиска.
 * Например, если список содержит «red», «blue», «green» и в аргументы метода передать «red», то метод должен вернуть true,
 * символизируя то, что этот цвет содержится в списке.
 *
 * 2.   Создайте LinkedList, содержащий целые числа, т.е. Integer. Напишите метод, который меняет местами первый и последний
 * элементы этого списка и возвращает этот список в новом виде. Т.е., если создали список [1, 2, 3, 4, 5],
 * то в результате должны получить [5, 2, 3, 4, 1].
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("purple");
        System.out.println("Список цветов: " + colors);
        System.out.println("Содержит ли список цвет " + "red" + "? " + ListUtils.containsColor(colors, "red"));
        System.out.println("Содержит ли список цвет " + "orange" + "? " + ListUtils.containsColor(colors, "orange"));

        System.out.println("Задание 2");
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Исходный список: " + numbers);
        LinkedList<Integer> swappedList = ListUtils.swapFirstAndLast(numbers);
        System.out.println("Список после обмена: " + swappedList);

    }
}