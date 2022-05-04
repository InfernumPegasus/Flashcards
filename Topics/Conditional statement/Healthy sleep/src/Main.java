import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();  // min 6
        int B = scanner.nextInt();  // max 10
        int H = scanner.nextInt();  // cur 8

        if (H < A)
            System.out.println("Deficiency");
        else if (H > B)
            System.out.println("Excess");
        else
            System.out.println("Normal");
    }
}