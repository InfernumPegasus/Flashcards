import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        var res = (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;

        if (res)
            System.out.println("Leap");
        else
            System.out.println("Regular");
    }
}