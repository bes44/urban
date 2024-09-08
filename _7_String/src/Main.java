/**
 * Домашнее задание по теме "String"
 * <p>
 * 1.     Дан массив со строками: String[] stringArray = {"ab", "cd", "ef"}. Получите массив символов этих строк: char[] charArray =  {'a', 'b', 'c', 'd', 'e', 'f'}.
 * <p>
 * 2.     Дана строка: String stroke = "12345". Выведите в консоль значение, которое можно, взяв первый и последний символ этой строки в следующем виде. Т.е.  "15".
 * <p>
 * 3.     Дана некоторая строка - "1203405". Найдите позицию первого нуля в строке. Т.е. позиция первого нуля в этой строке равна 2.
 */

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};
        String stroke = "12345";
        String str = "1203405";
        System.out.println("-------Задание1");
        System.out.println(createCharArray(stringArray));
        System.out.println("-------Задание2");
 //       System.out.println(takeFirstAndLastArray(createCharArray(stringArray)));
        System.out.println(takeFirstAndLast(stroke));
        System.out.println("-------Задание3");
        System.out.println(finedFirstZero(str));

    }

    public static char[] createCharArray(String[] a) {
        StringBuilder sb = new StringBuilder();

        for (String s : a) {
            sb.append(s);
        }
        char[] charArray = sb.toString().toCharArray();
        return charArray;
    }
    public static String takeFirstAndLastArray(char[] a) {
        StringBuilder sb = new StringBuilder();
         for (int i=0; i < a.length;i++)
        {
            if ((i==0) || i==(a.length-1))  sb.append(a[i]);
        }

        return sb.toString();
    }
    public static String takeFirstAndLast(String a) {
        StringBuilder sb = new StringBuilder();
        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length() - 1);
        sb.append(firstChar);
        sb.append(lastChar);
        return sb.toString();
    }
    public static int finedFirstZero(String a) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        return sb.indexOf("0");
    }

}