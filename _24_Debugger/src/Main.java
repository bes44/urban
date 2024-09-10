import java.util.Arrays;

/**
 * 1.    Дан массив целых чисел. Найти максимальное число из четных в этом массиве.
 * 2.    Дана строка "Привет, Александр, с праздником, с Новым Годом". Написать программу,
 * которая поменяет регистр символов. Т.е. результат должен быть таким:
 *   пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxEven = Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .max()
                .orElseThrow(() -> new RuntimeException("Нет четных чисел в массиве"));

        System.out.println("Максимальное четное число: " + maxEven);

        System.out.println("Задание 2");
        String input = "Привет, Александр, с праздником, с Новым Годом";
        String output = ChangeCase.ChangeCase(input);
        System.out.println(output);

    }
}