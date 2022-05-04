import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        var map = new TreeMap<String, Integer>();
        for (var item : strings) {
            if (!map.containsKey(item)) {
                map.put(item, 0);
            }
            map.put(item, map.get(item) + 1);
        }
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((word, count) -> System.out.println(word + " : " + count));
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}