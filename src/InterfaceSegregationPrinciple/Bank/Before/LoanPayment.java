package InterfaceSegregationPrinciple.Bank.Before;

//and later, after BankPayment is added, LoanPayment is added, along with
//intiateLoanSettlement() and intiateLoanRePayment()

import InterfaceSegregationPrinciple.Bank.Before.Payment;

import java.util.ArrayList;


public class LoanPayment implements Payment {

    @Override
    public void initiatePayments() {
        throw new UnsupportedOperationException("This is not a bank payment");
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

    @Override
    public void intiateLoanSettlement() {
        // ...
    }

    @Override
    public void initiateRePayment() {
        // ...
    }
}