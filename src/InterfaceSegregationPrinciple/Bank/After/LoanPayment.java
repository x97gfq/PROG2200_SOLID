package InterfaceSegregationPrinciple.Bank.After;

import java.util.ArrayList;

public class LoanPayment implements Loan {

    @Override
    public void intiateLoanSettlement() {
        // ...
    }

    @Override
    public void initiateRePayment() {
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