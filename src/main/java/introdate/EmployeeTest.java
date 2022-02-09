package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.print("What is your name? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.print("Year of birth? ");
        int yerOfBirth = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

        System.out.print("Month of birth? ");
        int monthOfBirth = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

        System.out.print("Day of birth? ");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

        Employee employee = new Employee(yerOfBirth,monthOfBirth,dayOfBirth,name );

        System.out.println("Name: " + employee.getName() );

        System.out.println("Birth date: " + employee.getDateOfBirth() + " " + employee.getDateOfBirth().getDayOfWeek().toString().toLowerCase() );

        System.out.println("Begin of employment: " + employee.getBeginEmployment() + " " + employee.getBeginEmployment().getDayOfWeek().toString().toLowerCase() );

    }
}
