class Employee {

    String name;
    int salary;
    String address;
    static final String UNKNOWN = "unknown";
    Employee() {
        this(UNKNOWN, 0, UNKNOWN);
    }
    Employee(String name, int salary) {
        this(name, salary, UNKNOWN);
    }
    Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
