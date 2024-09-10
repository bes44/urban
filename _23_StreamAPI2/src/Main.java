import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Напишите программу для вычисления суммы всех четных и нечетных чисел в списке с использованием потоков.
 *
 * 2. Напишите программу для удаления всех повторяющихся элементов из списка с помощью потоков
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sumOfEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOfOdds = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма всех четных чисел: " + sumOfEvens);
        System.out.println("Сумма всех нечетных чисел: " + sumOfOdds);

        System.out.println("Задание 2");
        List<String> items = Arrays.asList("1", "2", "3", "1", "2", "4");
        List<String> uniqueItems = items.stream()
                .distinct()
                .collect(Collectors.toList());

                System.out.println("Список без повторяющихся элементов: " + uniqueItems);
    }
}