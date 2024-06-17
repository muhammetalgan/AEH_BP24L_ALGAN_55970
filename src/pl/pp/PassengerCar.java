public class PassengerCar extends Vehicle {
    private int numberOfDoors;

    public PassengerCar(String registrationNumber, String vinNumber, String color,
                        double price, double fuelConsumption, double fuelLevel, double mileage,
                        int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void drive(double distance) {
        // Implementation for driving a passenger car
        this.mileage += distance;
        // Adjust fuel level based on distance and fuel consumption
        this.fuelLevel -= distance * this.fuelConsumption;
    }

    @Override
    public void refuel(double liters) {
        // Implementation for refueling a passenger car
        this.fuelLevel += liters;
    }

    // Getter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
