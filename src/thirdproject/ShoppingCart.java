package thirdproject;
// This line declares the package "thirdproject" for the current Java file.

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
// Declaration of the ShoppingCart class.

    private List<Product> items = new ArrayList<>();
    // Declaration of a private list to store products in the shopping cart.

    // Method to add a product to the shopping cart.
    public void addItem(Product product) {
        items.add(product);
    }

    // Method to remove a product from the shopping cart.
    public void removeItem(Product product) {
        items.remove(product);
    }

    // Method to retrieve the list of items in the shopping cart.
    public List<Product> getItems() {
        return items;
    }

    // Method to calculate and retrieve the total amount of all items in the shopping cart.
    public double getTotalAmount() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Placeholder method for adding a product to the cart (TODO: To be implemented).
    public void addToCart(Product product1) {
        // TODO Auto-generated method stub
    }

    // Placeholder method for removing a product from the cart (TODO: To be implemented).
    public void removeFromCart(Product product1) {
        // TODO Auto-generated method stub
    }
}
