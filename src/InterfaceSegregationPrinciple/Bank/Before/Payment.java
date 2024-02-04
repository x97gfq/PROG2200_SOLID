package InterfaceSegregationPrinciple.Bank.Before;

import java.util.ArrayList;

public interface Payment {
    void initiatePayments();
    Object status();
    ArrayList<Object> getPayments();

    //then more methods get added:
    void intiateLoanSettlement();
    void initiateRePayment();

}