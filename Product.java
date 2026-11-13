// Product.java
public class Product {
    static int totalProducts = 0;
    String name;
    double price;
    int quantity;

    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
        totalProducts++;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    Product(Product other) {
        this.name = other.name;
        this.price = other.price;
        this.quantity = other.quantity;
        totalProducts++;
    }

    double stockValue() {
        return price * quantity;
    }

    void display() {
        System.out.println(name + " | Rs " + price + " | qty " + quantity);
    }
}
