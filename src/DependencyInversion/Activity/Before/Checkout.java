package DependencyInversion.Activity.Before;

public class Checkout {

    public void completeCheckout(float amount, int paymentType) {
        //
        //
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
