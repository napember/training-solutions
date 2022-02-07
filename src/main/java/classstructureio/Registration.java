package classstructureio;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your email address? ");
        String mail = scanner.nextLine();

        System.out.println("What is your psw? ");

        String psw = scanner.nextLine();

        System.out.println("Your registration is: " + mail + "/" + psw);

    }
}
