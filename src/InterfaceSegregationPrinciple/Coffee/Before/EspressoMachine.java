package InterfaceSegregationPrinciple.Coffee.Before;

public class EspressoMachine implements CoffeeMachine {

    @Override
    public void brewFilterCoffee() throws Exception {
        throw new Exception("This machine only brews espresso.");
    }

    @Override
    public void addGroundCoffee() {
        System.out.println("adding ground coffee");
    }

    @Override
    public void brewEspresso() throws Exception {
        System.out.println("brewing espresso");
    }
}
