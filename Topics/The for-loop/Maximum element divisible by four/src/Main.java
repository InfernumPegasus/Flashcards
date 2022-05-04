import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 1;
        int e;

        for (int i = 0; i < n; i++) {
            e = scanner.nextInt();
            if (e % 4 == 0 && e > max) {
                max = e;
            }
        }
        System.out.println(max);
    }
}