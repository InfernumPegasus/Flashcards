import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i < 1000 || i > 9999) {
            System.out.println(6);
        } else {
            var c = Integer.toString(i).toCharArray();
            if (c[0] == c[3] && c[1] == c[2]) {
                System.out.println(1);
            } else
                System.out.println(6);
        }
    }
}