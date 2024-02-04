package InterfaceSegregationPrinciple.Vehicle.Work.Classes;

import InterfaceSegregationPrinciple.Vehicle.Work.Interfaces.Electrify;
import InterfaceSegregationPrinciple.Vehicle.Work.Interfaces.Fuel;
import InterfaceSegregationPrinciple.Vehicle.Work.Interfaces.Movable;
import InterfaceSegregationPrinciple.Vehicle.Work.Interfaces.Vehicle;

public class Phev implements Electrify, Fuel, Movable, Vehicle {


    @Override
    public void chargeBattery() {

    }

    @Override
    public void replaceBattery() {

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
