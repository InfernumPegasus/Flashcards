import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int left = scanner.nextInt();
        int right = scanner.nextInt();

        // left <= num <= right

        var res = (left <= num && num <= right) ||
                (right <= num && num <= left);

        System.out.println(res);
    }
}