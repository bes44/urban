/**
 * 1.    Создайте HashMap c ключами Integer, значениями – String. Напишите метод, который возвращает набор ключей, содержащихся в этой карте.
 * 2.    Создайте HashMap c ключами Integer, значениями – String. Напишите метод, который возвращает ассоциативный массив,
 * состоящий из элементов исходного map, при условии, что туда войдут элементы с длиной строки более 3.
 * Т.е. исходный map: [1="Red",2="Green",3="Black"].
 * Новый map: [2="Green",3="Black"].
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Green");
        map.put(4, "Yellow");
        Set<Integer> keys = MapUtils.getKeySet(map);
        System.out.println("Набор ключей: " + keys);

        System.out.println("Задание 2");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Red");
        map2.put(2, "Green");
        map2.put(3, "Black");
    //    map2.put(4, "Blue");

         Map<Integer, String> filteredMap = MapUtils.filterByStringLength(map2, 3);
        System.out.println("Исходный map: " + map2);
        System.out.println("Отфильтрованный map: " + filteredMap);

    }
}