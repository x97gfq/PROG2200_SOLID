package InterfaceSegregationPrinciple.Bank.After;

public interface Loan extends Payment{
    void intiateLoanSettlement();
    void initiateRePayment();
}
