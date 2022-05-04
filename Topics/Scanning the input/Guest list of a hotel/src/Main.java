import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        var names = new ArrayList<String>();

        while (scanner.hasNext()) {
            names.add(scanner.next());
        }

        Collections.reverse(names);

        for (var name : names) {
            System.out.println(name);
        }
    }
}