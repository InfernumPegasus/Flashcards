import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        var seed = a + b;

        Random random = new Random(seed);
        int i = 0;
        int sum = 0;
        while (i != n) {
            sum += random.nextInt(b - a + 1) + a;
            i++;
        }
        System.out.println(sum);
    }
}