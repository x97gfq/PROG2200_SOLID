In this example:

Switchable is the high-level module (abstraction) that
defines the contract for turning a device on and off.

LightBulb and Fan are the low-level modules (concrete
implementations) that implement the Switchable interface.

RemoteControl is a high-level module (dependent) that
depends on the Switchable interface. It accepts a
Switchable instance in its constructor.

In the Main class, we demonstrate the Dependency Inversion
Principle by creating instances of LightBulb and Fan,
and then using the RemoteControl to turn them on and off.
The RemoteControl class depends on the abstraction (Switchable),
not on specific implementations.

This simple example illustrates how the high-level RemoteControl
depends on the abstraction Switchable, allowing for flexibility
and easy substitution of different devices without modifying the
RemoteControl class.
