// Truck class inheriting from Vehicle
public class Truck extends Vehicle {
    private double loadCapacity; // in tons

    public Truck(String registrationNumber, String vinNumber, String color,
                 double price, double fuelConsumption, double fuelLevel, double mileage,
                 double loadCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void drive(double distance) {
        this.mileage += distance;
        this.fuelLevel -= distance * this.fuelConsumption;
    }

    @Override
    public void refuel(double liters) {
        this.fuelLevel += liters;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}
