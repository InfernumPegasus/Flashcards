import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();

        var res = i1 > 0 && i2 <= 0 && i3 <= 0 ||
                i1 <= 0 && i2 > 0 && i3 <= 0 ||
                i1 <= 0 && i2 <= 0 && i3 > 0;

        System.out.println(res);
    }
}