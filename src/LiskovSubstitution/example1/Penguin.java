package LiskovSubstitution.example1;

public class Penguin extends Bird{
    @Override
    public void fly() {
        // Penguins cannot fly, so we override the method to provide a different behavior.
        System.out.println("Penguin cannot fly");
    }
}
