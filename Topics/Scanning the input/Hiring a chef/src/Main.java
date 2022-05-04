import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        var s1 = scanner.next();
        var s2 = scanner.next();
        var s3 = scanner.next();

        System.out.println(
                "The form for " + s1 + " is completed. " +
                        "We will contact you if we need a chef who cooks " + s3 +
                        " dishes and has " + s2 + " years of experience."
        );
    }
}