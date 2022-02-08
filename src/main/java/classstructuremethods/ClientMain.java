package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Kovács Kázmér");
        client.setAddress("Budapest Vincellér utca");
        client.setYear(1958);

        System.out.println(client.getName() + "; Cím: " + client.getAddress()+ "; Született: " + client.getYear() + ". évben" );

        client.migrate("Budapest Badacsony utca");

        System.out.println(client.getName() + "; Új cím: " + client.getAddress() );

    }
}
