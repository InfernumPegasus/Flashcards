import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        var res = (-15 < i && i <= 12) ||
                (14 < i && i < 17) ||
                i >= 19;

        if (res)
            System.out.println("True");
        else
            System.out.println("False");
    }
}