package thirdproject;
// This line declares the package "thirdproject" for the current Java file.

class Order {
// Declaration of the Order class.

    private User user;
    private ShoppingCart cart;
    private String orderStatus;

    // Constructor for creating an Order with a user and a shopping cart.
    public Order(User user, ShoppingCart cart) {
        this.user = user;
        this.cart = cart;
        this.orderStatus = "Pending";
    }

    // Method to place the order.
    public void placeOrder() {
        if (orderStatus.equals("Pending")) {
            // Simulate order placement logic

            System.out.println("Placing the order for User: " + user.getUsername());

            System.out.println("Order Details:");
            for (Product product : cart.getItems()) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }

            System.out.println("Total Amount: $" + cart.getTotalAmount());

            // Implement additional order placement logic here, such as recording order details,
            // updating inventory, etc. For this example, we'll keep it simple by updating the order status.
            this.orderStatus = "Placed";

            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Order has already been placed.");
        }
    }

    // Getter method for retrieving the associated user.
    public User getUser() {
        return user;
    }

    // Getter method for retrieving the associated shopping cart.
    public ShoppingCart getCart() {
        return cart;
    }

    // Getter method for retrieving the order status.
    public String getOrderStatus() {
        return orderStatus;
    }
}

