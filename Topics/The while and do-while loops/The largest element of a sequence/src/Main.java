import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int v;

        do {
            v = scanner.nextInt();
            if (v > n) {
                n = v;
            }
        } while (v != 0);

        System.out.println(n);
    }
}