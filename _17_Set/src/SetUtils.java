import java.util.HashSet;
import java.util.Set;

public class SetUtils {
    public static Set<String> findCommonColors(Set<String> set1, Set<String> set2) {
        Set<String> commonColors = new HashSet<>(set1);
        commonColors.retainAll(set2);
        return commonColors;
    }
}
