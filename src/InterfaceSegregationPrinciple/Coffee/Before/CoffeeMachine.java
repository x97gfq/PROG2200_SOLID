package InterfaceSegregationPrinciple.Coffee.Before;

public interface CoffeeMachine {
    void brewFilterCoffee() throws Exception;
    void addGroundCoffee();
    void brewEspresso() throws Exception;
}
