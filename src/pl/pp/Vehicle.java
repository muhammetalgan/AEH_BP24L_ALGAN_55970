public abstract class Vehicle {
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption;
    protected double fuelLevel;
    protected double mileage;

    public Vehicle(String registrationNumber, String vinNumber, String color,
                   double price, double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public abstract void drive(double distance);
    public abstract void refuel(double liters);

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getMileage() {
        return mileage;
    }
}
