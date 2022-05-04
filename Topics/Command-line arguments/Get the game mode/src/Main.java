class Problem {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("default");
        } else {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("mode")) {
                    System.out.println(args[i + 1]);
                    break;
                }
            }
        }
    }
}