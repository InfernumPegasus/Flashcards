import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 1) {
                n *= 3;
                n++;
            } else {
                n /= 2;
            }
        }
        System.out.println(n);
    }
}