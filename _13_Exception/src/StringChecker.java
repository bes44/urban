public class StringChecker {
    public static void checkForNumbers(String input) {
        if (input.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Строка \"" + input+ "\" содержит числа.");
        }
    }
}
