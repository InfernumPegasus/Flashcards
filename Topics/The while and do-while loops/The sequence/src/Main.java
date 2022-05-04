import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int c = 0;
        int res = Integer.MIN_VALUE;
        int amount = scanner.nextInt();

        while (scanner.hasNextInt() && c <= amount) {
            c++;
            i = scanner.nextInt();
            if (i % 4 == 0 && i > res) {
                res = i;
            }
        }
        System.out.println(res);
    }
}
