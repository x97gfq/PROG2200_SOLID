In this example:

The NotificationService interface represents the high-level module,
which defines the sendNotification method.

The EmailNotifier and SMSSender classes are the low-level modules
that implement the NotificationService interface.

The NotificationClient class represents a client that depends on
the NotificationService interface. It accepts a NotificationService
instance in its constructor, allowing you to inject the desired
notification service.

In the Main class, we demonstrate the Dependency Inversion Principle
by injecting the specific notification service instances into the
NotificationClient objects. This allows the high-level module to
depend on abstractions (the NotificationService interface) rather
than concrete implementations.

When you run the Main class, it will send email and SMS notifications
using the respective low-level services, demonstrating the use of the
Dependency Inversion Principle in the design of the notification system.
