import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class MapUtils {
    public static Set<Integer> getKeySet(HashMap<Integer, String> map) {
        return map.keySet();
    }

    public static Map<Integer, String> filterByStringLength(Map<Integer, String> map, int length) {
        Map<Integer, String> filteredMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > length) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }
        return filteredMap;
    }

}
