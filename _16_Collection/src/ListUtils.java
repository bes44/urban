import java.util.ArrayList;
import java.util.LinkedList;

public class ListUtils {

    public static boolean containsColor(ArrayList<String> colors, String color) {
        return colors.contains(color);
    }

    public static LinkedList<Integer> swapFirstAndLast(LinkedList<Integer> list) {
        if (list.size() < 2) {
            return list;
        }
        Integer firstElement = list.getFirst();
        Integer lastElement = list.getLast();
        list.set(0, lastElement);
        list.set(list.size() - 1, firstElement);
        return list;
    }

}
