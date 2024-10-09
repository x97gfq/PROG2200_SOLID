package DependencyInversion.Activity.Before;

public class Main {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        checkout.completeCheckout(1000, 1);


    }

}
