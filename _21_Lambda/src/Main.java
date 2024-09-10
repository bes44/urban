/**
 * Напишите программу, реализующую лямбда-выражение для вычисления суммы всех четных элементов списка.
 * Напишите программу, реализующую лямбда-выражение для определения самого длинного слова в списке, состоящего из нескольких слов.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenSum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
            System.out.println("Сумма всех четных элементов: " + evenSum);

        System.out.println("задание 2");
        List<String> words = Arrays.asList("самолет", "пароход", "танк", "престидижитация", "карамель");
        String longestWord = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        // Вывод результата
        System.out.println("Самое длинное слово: " + longestWord);

    }
}