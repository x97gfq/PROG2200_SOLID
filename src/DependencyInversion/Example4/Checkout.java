package DependencyInversion.Example4;

public class Checkout {

    public void completeCheckout(float amount) {
        //
        //
        int paymentType = 1;

        if (paymentType == 1) {
            Bank bank = new Bank();
            bank.makePayment();
        } else {
            PayPal paypal = new PayPal();
            paypal.payWithPayPal();
        }

        //
        //
    }

}
