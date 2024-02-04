package DependencyInversion.Example3;

// Low-level modules (concrete implementations)
class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}