package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        String message;
        for ( String elem:args ) {
            if ( "list".equals(elem)) {
                message = "Listázás";
            }
            else if ( "add".equals(elem)) {
                message = "Hozzáadás";
            }
            else if ( "delete".equals(elem)) {
                message = "Törlés";
            } else {
                message = "Ismeretlen művelet";
            }
            System.out.println(message);
        }
    }
}
