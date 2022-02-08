package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        client.name = scanner.nextLine();

        System.out.println("Age? ");
        client.year = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

        System.out.println("Name: " + client.name);
        System.out.println("Year of birth: " + client.year );

    }
}
