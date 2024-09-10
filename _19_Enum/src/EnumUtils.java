



public class EnumUtils {
    public static int getLetterPosition(char letter) {
        letter = Character.toUpperCase(letter);
        return Alphabet.valueOf(String.valueOf(letter)).getPosition();
    }
}
