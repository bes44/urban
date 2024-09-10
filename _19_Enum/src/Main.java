import java.util.ArrayList;
import java.util.List;

/**
 * 1.    Необходимо написать метод, который возвращает позицию буквы алфавита. Для реализации программы создать enum алфавита.
 *
 * 2.    Написать класс Person с полями имени(name), возраста(age). Для определения пола Person создать enum Gender
 * с соответствующими константами. В классе с методом main создать список объектов Person, состоящий не менее,
 * чем из 10 человек разного пола. Написать метод, возвращающий список объектов класса Person в зависимости
 * от введенного параметра пола, т.е. список мужчин или женщин.
 */

public class Main {
    public static List<Person> filterByGender(List<Person> persons, Gender gender) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender() == gender) {
                filteredList.add(person);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        char letter1 = 'A';
        char letter2 = 'Z';
        char letter3 = 'Y';
       System.out.println("Позиция буквы " + letter1 + " в алфавите: " + EnumUtils.getLetterPosition(letter1));
        System.out.println("Позиция буквы " + letter2 + " в алфавите: " + EnumUtils.getLetterPosition(letter2));
        System.out.println("Позиция буквы " + letter3 + " в алфавите: " + EnumUtils.getLetterPosition(letter3));

        System.out.println("Задание 2");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Алексей", 30, Gender.MALE));
        persons.add(new Person("Мария", 25, Gender.FEMALE));
        persons.add(new Person("Иван", 40, Gender.MALE));
        persons.add(new Person("Анна", 22, Gender.FEMALE));
        persons.add(new Person("Дмитрий", 35, Gender.MALE));
        persons.add(new Person("Елена", 28, Gender.FEMALE));
        persons.add(new Person("Сергей", 45, Gender.MALE));
        persons.add(new Person("Ольга", 32, Gender.FEMALE));
        persons.add(new Person("Женя", 27, Gender.MALE));
        persons.add(new Person("Женя", 29, Gender.FEMALE));

         List<Person> males = filterByGender(persons, Gender.MALE);
        List<Person> females = filterByGender(persons, Gender.FEMALE);

         System.out.println("Мужчины: " + males);
        System.out.println("Женщины: " + females);
    }
}

