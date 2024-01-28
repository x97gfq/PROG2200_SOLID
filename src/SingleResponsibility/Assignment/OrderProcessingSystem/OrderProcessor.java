package SingleResponsibility.Assignment.OrderProcessingSystem;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    // Manages customer orders
    private List<Item> items;
    private double totalCost;

    public OrderProcessor() {
        items = new ArrayList<>();
        totalCost = 0.0;
    }

    public void addItemToOrder(Item item) {
        items.add(item);
        totalCost += item.getPrice();
    }

    public double calculateTotalCost() {
        return totalCost;
    }

    public boolean applyDiscount(Discount discount) {
        if (discount != null && totalCost > 0) {
            totalCost -= totalCost * (discount.getPercentage() / 100.0);
            return true;
        }
        return false;
    }

    public boolean processPayment(Payment payment) {
        // Simulating payment processing
        if (payment.getAmount() >= totalCost) {
            // Payment successful
            return true;
        }
        // Payment failed
        return false;
    }

    public void sendOrderConfirmationEmail(Order order) {
        // Simulating sending an email
        System.out.println("Sending order confirmation email for Order: " + order);
    }}
