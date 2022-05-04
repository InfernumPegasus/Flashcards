import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;
        int res = 1;
        while (res <= n) {
            System.out.println(res);
            s++;
            res = s * s;
        }
    }
}