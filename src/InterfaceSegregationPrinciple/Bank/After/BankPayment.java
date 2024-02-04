package InterfaceSegregationPrinciple.Bank.After;

import java.util.ArrayList;

public class BankPayment implements Bank {

    @Override
    public void initiatePayments() {
        // ...
    }

    @Override
    public Object status() {
        // ...
        return new Object();
    }

    @Override
    public ArrayList<Object> getPayments() {
        // ...
        return new ArrayList<Object>();
    }
}