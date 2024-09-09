public class NumberChecker {
    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " нечетное число");
        }
    }


}
