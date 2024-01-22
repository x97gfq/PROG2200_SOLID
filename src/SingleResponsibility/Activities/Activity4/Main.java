package SingleResponsibility.Activities.Activity4;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();

        order.processOrder();

        order.printOrderReceipt();

        order.sendOrderConfirmationEmail();

    }

}
