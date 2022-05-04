import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var list = new ArrayList<Integer>();

        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        var res = list.get(0) <= list.get(1) && list.get(1) <= list.get(2) ||
                list.get(0) >= list.get(1) && list.get(1) >= list.get(2);

        System.out.println(res);
    }
}