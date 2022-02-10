package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee("Kovács Bendi",2018,400000);

        e.raiseSalary(50000);

        System.out.println(e);

    }
}
