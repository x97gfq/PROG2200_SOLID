package DependencyInversion.Example3;

public class Main {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switchable fan = new Fan();

        RemoteControl remote1 = new RemoteControl(lightBulb);
        RemoteControl remote2 = new RemoteControl(fan);

        remote1.turnOn();
        remote1.turnOff();

        remote2.turnOn();
        remote2.turnOff();
    }
}