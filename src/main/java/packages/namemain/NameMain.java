package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("Mr");
        FirstName firstName = new FirstName("Smith");
        LastName lastName = new LastName("John");

        System.out.println("Hello " + prefix.getPre()+ " " + lastName.getLast()+ " " + firstName.getFirst() + "!");

    }
}
