package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator uservalidator = new UserValidator();

        System.out.println("User name:");
        String userName = scanner.nextLine();
        System.out.println(uservalidator.isValidUsername(userName)?"Ok":"Missing user name!" );

        System.out.println("Psw 1:");
        String psw1 = scanner.nextLine();
        System.out.println("Psw 2:");
        String psw2 = scanner.nextLine();

        System.out.println(uservalidator.isValidPassword(psw1, psw2)?"Ok":"Psw error!" );

        System.out.println("Email address:");
        String email = scanner.nextLine();
        System.out.println(uservalidator.isValidEmail(email)?"Ok":"Email error!" );

    }
}
