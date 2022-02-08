package classstructureintegrate;

public class Product {
    private String name;
    private int price;

    public Product(String name) {
        this.name = name;
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice( int price) {
        this.price += price;
    }

    public void decreasePrice( int price) {
        this.price -= price;
    }
}
