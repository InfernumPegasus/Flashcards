import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value

        // будни:    10 - 20 (вкл)
        // выходные: 15 - 25 (вкл)

        int day = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        var res = 10 <= day && day <= 20 && !isWeekend ||
                15 <= day && day <= 25 && isWeekend;

        System.out.println(res);
    }
}
