/**
 * Домашнее задание JavaIfSwitchReturn
 *
 * 1. Даны два числа x и y. Программа должна вывести в консоль «Удачное совпадение», – если оба числа четные, либо оба числа нечетные. Иначе программа ничего не выводит.
 *
 * 2. В переменной day лежит какое-то число из интервала от 1 до 31. Определите в какую декаду месяца попадает это число (в первую, вторую или третью).
 */

public class Main {
    public static boolean chet (int number){
        if (number%2==0) return true;
        else return false;
    }

    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        int x,y,day;
        x=rnd(100);
        y=rnd(100);;
        System.out.println("______________задание 1");
        System.out.println(("x="+x + " y="+y));
        if (chet(x)==chet(y)) System.out.println("Удачное совпадение");
        System.out.println("______________задание 2");
        day=rnd(1,31);
        System.out.println(("day="+day));
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Первая декада");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Вторая декада");
                break;
            default:System.out.println("Третья декада");
        }
    }
}