package InterfaceSegregationPrinciple.Vehicle.Work.Classes;

import InterfaceSegregationPrinciple.Vehicle.Work.Interfaces.Fly;
import InterfaceSegregationPrinciple.Vehicle.Work.Interfaces.Fuel;
import InterfaceSegregationPrinciple.Vehicle.Work.Interfaces.Movable;
import InterfaceSegregationPrinciple.Vehicle.Work.Interfaces.Vehicle;

public class Airplane implements Fly, Fuel, Movable, Vehicle {


    @Override
    public void fly() {

    }

    @Override
    public void addFuel() {

    }

    @Override
    public void replaceTank() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setColor() {

    }

    @Override
    public void setPrice() {

    }
}
