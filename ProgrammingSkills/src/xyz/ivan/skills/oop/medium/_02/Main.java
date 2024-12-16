package xyz.ivan.skills.oop.medium._02;

import java.util.ArrayList;
import java.util.List;
// Design an online shopping cart system
// Description:
// Create a Product class with attributes: name, price, quantity.
// Create a ShoppingCart class with:
// A list to store Product objects
// Add product method add_product(product)
// Remove product method remove_product(product_name)
// Calculate total price method calculate_total()


public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 0.5, 10);
        Product banana = new Product("Banana", 0.2, 5);

        ShoppingCart cart = new ShoppingCart();
        cart.add_product(apple);
        cart.add_product(banana);

        System.out.println("Total price: " + cart.calculate_total());

        cart.remove_product("Apple");
        System.out.println("Total price after removing Apple: " + cart.calculate_total());
    }
}

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void add_product(Product product) {
        products.add(product);
    }

    public void remove_product(String product_name) {
        products.removeIf(product -> product.name.equals(product_name));
    }

    public double calculate_total() {
        double total = 0;
        for (Product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }
}


