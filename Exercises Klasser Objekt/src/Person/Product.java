package Person;

public class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Product (int id, String name){
        this.id = id;
        this.name = name;

    }

    public Product (double price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
}
