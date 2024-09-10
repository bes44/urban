/**
 * 1.    Создайте список типа String, например, названия пищевых продуктов.
 * Напишите программу для подсчета количества строк в списке, начинающихся с определенной буквы,
 * с использованием потоков.
 * 2.    Создать класс Person с полями name и age. В классе с методом main создать список, состоящий не менее,
 * чем из 10 объектов класса Person с произвольными данными. Отфильтровать и вывести в консоль объекты Person,
 * возраст которых более 30 лет.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      System.out.println("Задание 1");
      List<String> foods = Arrays.asList("apple", "banana", "avocado", "blueberry", "carrot", "apricot");
      String searchLetter = "a";
      long count = foods.stream()
                .filter(food -> {
                    return food.startsWith(String.valueOf((searchLetter.toLowerCase())));
                })
                .count();
      System.out.println("Количество продуктов, начинающихся с буквы " + searchLetter.toUpperCase() + ": " + count);

      System.out.println("Задание 2");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Алексей", 30));
        persons.add(new Person("Мария", 25));
        persons.add(new Person("Иван", 40));
        persons.add(new Person("Анна", 22));
        persons.add(new Person("Дмитрий", 35));
        persons.add(new Person("Елена", 28));
        persons.add(new Person("Сергей", 45));
        persons.add(new Person("Ольга", 32));
        persons.add(new Person("Николай", 27));
        persons.add(new Person("Татьяна", 29));

        // Фильтрация объектов Person, возраст которых более 30 лет
        List<Person> filteredPersons = persons.stream()
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toList());

        // Вывод отфильтрованных объектов Person
        System.out.println("Люди старше 30 лет:");
        filteredPersons.forEach(System.out::println);

    }
}