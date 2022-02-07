package classstructureio;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Első szám: ");
        int firstNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Második szám: ");
        int lastNum = scanner.nextInt();
        scanner.nextLine();
        int sum = firstNum + lastNum;

        System.out.println("Összeg: " + firstNum + " + " + lastNum + " = " + sum);


    }
}
