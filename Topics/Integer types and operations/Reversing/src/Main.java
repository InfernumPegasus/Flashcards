import java.util.Scanner;

class Main {

    public static int getReverseInt(int value) {
        int resultNumber = 0;
        for (int i = value; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        return resultNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = getReverseInt(scanner.nextInt());

        System.out.println(i);
    }
}
