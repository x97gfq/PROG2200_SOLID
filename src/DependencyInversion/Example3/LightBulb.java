package DependencyInversion.Example3;

// Low-level modules (concrete implementations)
class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("Light Bulb is ON");
    }

    public void turnOff() {
        System.out.println("Light Bulb is OFF");
    }
}