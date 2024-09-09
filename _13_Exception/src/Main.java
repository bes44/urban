/**
 * 1.    Напишите метод, который принимает целое число в качестве параметра и выдает исключение, если число нечетное.
 * Необходимо протестировать ее в методе main с разными числами.
 *
 * 2. ***Напишите метод, который принимает строку в качестве входных данных и выдает исключение,
 * если строка содержит числа
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] testNumbers = {2, 3, 4, 5, 6};

        for (int number : testNumbers) {
            try {
                NumberChecker.checkEvenNumber(number);
                System.out.println(number + " Четное");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: исключение " + e.getMessage());
            }
        }
        System.out.println("Задание 2");
        String[] testStrings = {"Hello", "World123", "Java", "2024", "Test"};

        for (String str : testStrings) {
            try {
                StringChecker.checkForNumbers(str);
                System.out.println("Строка \"" + str + "\" не содержит чисел.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка! " + e.getMessage());
            }
        }
    }
}
