class Employee {

    String name;
    int salary;
    String address;

    Employee() {
        name = "unknown";
        address = "unknown";
        salary = 0;
    }

    Employee(String n, int s) {
        name = n;
        salary = s;
        address = "unknown";
    }

    Employee(String n, int s, String a) {
        name = n;
        salary = s;
        address = a;
    }
}