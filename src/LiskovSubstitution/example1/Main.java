package LiskovSubstitution.example1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird penguin = new Penguin();

        bird.fly();     // Outputs: Bird is flying
        penguin.fly();  // Outputs: Penguin cannot fly

        Seagull gull = new Seagull();
        gull.fly();

        //in a list:
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(bird);
        birds.add(penguin);

        for(Bird b:birds) {
            b.fly();
        }
    }
}
