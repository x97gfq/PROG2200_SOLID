package DependencyInversion.Example3;

// High-level module (dependent)
class RemoteControl {
    private Switchable device;

    public RemoteControl(Switchable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}