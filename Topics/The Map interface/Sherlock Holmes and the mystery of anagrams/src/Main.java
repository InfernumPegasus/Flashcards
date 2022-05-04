import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static HashMap<Character, Integer> wordsCount(String str) {
        var map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            var item = str.charAt(i);
            if (!map.containsKey(item)) {
                map.put(item, 0);
            }
            map.put(item, map.get(item) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first  = scanner.nextLine().toLowerCase(Locale.ROOT);
        String second = scanner.nextLine().toLowerCase(Locale.ROOT);

        var map1 = wordsCount(first);
        var map2 = wordsCount(second);

        if (Objects.equals(map1, map2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}