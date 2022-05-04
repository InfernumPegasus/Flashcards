import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i;

        do {
            i = scanner.nextInt();
            sum += i;
        } while (i != 0);
        System.out.println(sum);
    }
}