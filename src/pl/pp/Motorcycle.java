public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String registrationNumber, String vinNumber, String color,
                      double price, double fuelConsumption, double fuelLevel, double mileage,
                      boolean hasSidecar) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
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

    public boolean hasSidecar() {
        return hasSidecar;
    }
}
