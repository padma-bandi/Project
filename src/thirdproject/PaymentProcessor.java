package thirdproject;
// This line declares the package "thirdproject" for the current Java file.

class PaymentProcessor {
// Declaration of the PaymentProcessor class.

    // Method to process payment with a specified amount and payment method.
    public boolean processPayment(double amount, String paymentMethod) {
        // Simulate payment processing using a mock payment gateway

        // Check if the payment method is valid (e.g., Credit Card, PayPal, etc.)
        if (isValidPaymentMethod(paymentMethod)) {
            // Check if the amount is valid
            if (amount > 0) {
                // Simulate a successful payment
                System.out.println("Processing payment of $" + amount + " via " + paymentMethod);
                System.out.println("Payment successful.");
                return true;
            } else {
                System.out.println("Invalid payment amount.");
            }
        } else {
            System.out.println("Invalid payment method.");
        }

        // If payment processing fails, return false
        System.out.println("Payment processing failed.");
        return false;
    }

    // Private method to check if the payment method is valid.
    private boolean isValidPaymentMethod(String paymentMethod) {
        // Simulate validation of payment method (e.g., check against a list of supported methods)
        // For simplicity, we'll assume all payment methods are valid except for "Invalid Method".
        return !"Invalid Method".equals(paymentMethod);
    }
}
