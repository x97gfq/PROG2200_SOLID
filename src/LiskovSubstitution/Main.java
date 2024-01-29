package LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird penguin = new Penguin();

        bird.fly();     // Outputs: Bird is flying
        penguin.fly();  // Outputs: Penguin cannot fly

        Seagull gull = new Seagull();
        gull.fly();
    }
}
