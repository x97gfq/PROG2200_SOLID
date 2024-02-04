package InterfaceSegregationPrinciple.Vehicle.Before;

public class Car implements Vehicle {
    double price;
    String color;

    public void setPrice(double price) {

    }

    public void setColor(String color) {

    }

    public void start() {

    }

    public void stop() {

    }

    public void fly() {
        System.out.println("Car's can't fly (yet)");
    }

    public void addFuel() {

    }
}