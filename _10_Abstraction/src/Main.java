/**
 * 1.    Напишите программу для создания абстрактного класса Instrument с абстрактными методами play() и tune().
 * Создайте подклассы для Guitar и Piano, которые расширяют класс Instrument и реализуют соответствующие методы для игры и настройки каждого инструмента.
 *
 * 2.    Напишите программу для создания абстрактного класса Bird с абстрактными методами fly() и makeSound().
 * У класса Bird имеется поле, характеризующее скорость полета flySpeed. У класса Bird есть конструктор.
 * Создайте подклассы Eagle и Hawk, расширяющие класс Bird, и реализуйте соответствующие методы для описания того,
 * как каждая птица летает и издает звуки.
 */

public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument piano = new Piano();
        System.out.println("Задание 1");

        guitar.play();
        guitar.tune();
        piano.play();
        piano.tune();
        System.out.println("Задание 2");
        Bird eagle = new Eagle(50.0);
        Bird hawk = new Hawk(40.0);

        eagle.fly();
        eagle.makeSound();
        hawk.fly();
        hawk.makeSound();
    }
}