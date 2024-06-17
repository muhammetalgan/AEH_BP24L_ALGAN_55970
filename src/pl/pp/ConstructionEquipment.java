public class ConstructionEquipment extends Vehicle {
    private double hoursWorked;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color,
                                 double price, double fuelConsumption, double fuelLevel, double mileage,
                                 double hoursWorked) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
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

    public double getHoursWorked() {
        return hoursWorked;
    }
}
