import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        int i = 2;

        while (value != 0) {
            value /= i;
            i++;
        }
        System.out.println(i - 1);
    }
}