package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store1 = new Store("Kalapács");
        Store store2 = new Store("Véső");

        store1.store(10);
        store2.store(20);

        store1.dispatch(5);
        store2.dispatch(10);

        System.out.println(store1.getProduct() + " " + store1.getStock() + " db");
        System.out.println(store2.getProduct() + " " + store2.getStock() + " db");

    }
}
