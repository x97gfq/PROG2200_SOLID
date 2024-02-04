package InterfaceSegregationPrinciple.Coffee.Before;

public class BasicCoffeeMachine implements CoffeeMachine {
    @Override
    public void brewFilterCoffee() {
        System.out.println("brewing coffee");
    }

    @Override
    public void addGroundCoffee() {
        System.out.println("adding ground coffee");
    }

    @Override
    public void brewEspresso() throws Exception {
        System.out.println("This machine only brews coffee.");
    }
}
