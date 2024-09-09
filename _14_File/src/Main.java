/**
 * Необходимо написать программу, которая дописывает файл. Программа предлагает записать данные фразой
 * "Вводите данные для записи". После того, как введены данные в консоль (необходимо использовать класс
 * Scanner для ввода данных в консоль), программа предлагает дополнить информацию фразой «Введите что-нибудь еще»
 * и данные можно дописать. Вся работа по заполнению файла ведется в бесконечном цикле. Если пользователь введет 0,
 * программа завершается строкой «Файл создан»
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "output.txt";
        System.out.println("Вводите данные для записи:");
        try (FileWriter writer = new FileWriter(fileName, true)) {
            while (true) {
                 String input = scanner.nextLine();
               if (input.equals("0")) {
                    System.out.println("Файл создан");
                    break;
                }
                writer.write(input + System.lineSeparator());
                System.out.println("Введите что-нибудь еще:");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }
    }
}