package classstructureintegrate;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankszámlaszám:");
        String banlkAccountNumber = scanner.nextLine();

        System.out.println("Tulajdonos:");
        String owner = scanner.nextLine();
        System.out.println("Egyenleg:");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount = new BankAccount(banlkAccountNumber,owner,amount);

        System.out.println("Betét:");
        amount = scanner.nextInt();
        scanner.nextLine();
        bankAccount.deposit(amount);

        System.out.println("Kivét:");
        amount = scanner.nextInt();
        scanner.nextLine();
        bankAccount.withdraw(amount);

        System.out.println("Kivét:");
        amount = scanner.nextInt();
        scanner.nextLine();
        bankAccount.withdraw(amount);

        System.out.println(bankAccount.getAccountNumber() + "/" + bankAccount.getOwner() + " egyenleg: "+ bankAccount.getBalance() );

    }
}
