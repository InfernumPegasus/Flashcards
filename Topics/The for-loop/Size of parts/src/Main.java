import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = 0;
        int normal = 0;
        int max = 0;
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            int anInt = scanner.nextInt();

            if (anInt == -1) {
                min++;
            }
            if (anInt == 0) {
                normal++;
            }
            if (anInt == 1) {
                max++;
            }
        }
        System.out.println(normal + " " + max + " " + min);
    }
}