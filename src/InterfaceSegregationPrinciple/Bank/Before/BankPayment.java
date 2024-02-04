package InterfaceSegregationPrinciple.Bank.Before;

import java.util.ArrayList;

public class BankPayment implements InterfaceSegregationPrinciple.Bank.Before.Payment {

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

    //after adding LoanPayment and the methods to the Payment interface, we're
    //required to implement these two here:

    @Override
    public void intiateLoanSettlement() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }
}