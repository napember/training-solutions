package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a számot:");
        int num = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni
        System.out.println(num + " " + (num%3 == 0 ? "":"nem ") + "osztható 3-al");

    }
}
