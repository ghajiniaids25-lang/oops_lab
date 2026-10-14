
import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.printf("%s - Rs.%.1f%n", name, price);
    }
}

class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void displayCart() {
        System.out.println("----- Shopping Cart -----");

        for (Product p : products) {
            p.display();
        }
    }

    double calculateTotal() {
        double total = 0;

        for (Product p : products) {
            total += p.price;
        }

        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("Laptop Bag", 1200);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 800);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        System.out.println("-------------------------");
        System.out.printf("Total Amount: Rs.%.1f%n",
                cart.calculateTotal());
    }
}
