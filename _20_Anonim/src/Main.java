/**
 * 1.    Написать функциональный интерфейс Printable с методом print().
 * В классе с методом main создать несколько анонимных классов с различными реализациями метода print().
 *
 * 2.    Написать функциональный интерфейс Concationble с методом concat(), который объединяет две строковых переменных,
 * передаваемых в параметры метода и возвращает строку. В классе с методом main создать несколько анонимных классов
 * с различными реализациями метода concat().
 */
public class Main {
    public static void main(String[] args) {

        Printable printable1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Это первая реализация метода print.");
            }
        };

        Printable printable2 = new Printable() {
            @Override
            public void print() {
                System.out.println("Это вторая реализация метода print.");
            }
        };

        Printable printable3 = new Printable() {
            @Override
            public void print() {
                System.out.println("Это третья реализация метода print.");
            }
        };

        System.out.println("Задание 1");
        printable1.print();
        printable2.print();
        printable3.print();

        System.out.println("Задание 2");
        Concationble concationble1 = new Concationble() {
            @Override
            public String concat(String str1, String str2) {
                return str1 + " " + str2;
            }
        };

        Concationble concationble2 = new Concationble() {
            @Override
            public String concat(String str1, String str2) {
                return str1.toUpperCase() + " " + str2.toUpperCase();
            }
        };

        Concationble concationble3 = new Concationble() {
            @Override
            public String concat(String str1, String str2) {
                return str1.toLowerCase() + " " + str2.toLowerCase();
            }
        };

        // Вызов метода concat() для каждого анонимного класса
        System.out.println(concationble1.concat("Hello", "World"));
        System.out.println(concationble2.concat("Hello", "World"));
        System.out.println(concationble3.concat("Hello", "World"));
    }
}