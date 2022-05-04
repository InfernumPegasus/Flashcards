import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i = scanner.nextInt();
        
        if (i <= 0)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
