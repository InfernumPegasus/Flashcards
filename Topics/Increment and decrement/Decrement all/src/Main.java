import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();

        System.out.print(--a1 + " ");
        System.out.print(--a2 + " ");
        System.out.print(--a3 + " ");
        System.out.print(--a4);
    }
}