package InterfaceSegregationPrinciple.Vehicle.Before;

public interface Vehicle {
    void setPrice(double price);
    void setColor(String color);
    void start();
    void stop();
    void fly();

    void addFuel();
}

