
class Problem {
    
    public static void main(String[] args) {
        var oper = args[0].charAt(0);
        int first = Integer.parseInt(args[1]);
        int second = Integer.parseInt(args[2]);

        switch (oper) {
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
