import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int sum = 0;
        int n = 0;

        for (int i = left; i <= right; i++) {
            if (i % 3 == 0) {
                sum += i;
                n++;
            }
        }
        System.out.println((double) sum / n);
    }
}