package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("What is your name? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Product product = new Product(name);

        System.out.println("Betét: ");

        int price = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni
        product.increasePrice(price);

        System.out.println("Kivét: ");
        price = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni
        product.decreasePrice(price);

        System.out.println(product.getName() + " számla: " + product.getPrice() );

    }
}
