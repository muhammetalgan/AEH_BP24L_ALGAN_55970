public class RentalTest {
    public static void main(String[] args) {
        Vehicle car = new PassengerCar("3535", "VIN1234", "Red", 25000, 7.5, 50, 5000, 4);
        Vehicle truck = new Truck("4747", "VIN5678", "Blue", 45000, 15.0, 100, 20000, 10);
        Vehicle motorcycle = new Motorcycle("6666", "VIN9999", "Black", 12000, 5.0, 20, 1000, true);
        Vehicle equipment = new ConstructionEquipment("7777", "VIN7777", "Yellow", 80000, 20.0, 200, 15000, 300);

        testVehicle(car);
        testVehicle(truck);
        testVehicle(motorcycle);
        testVehicle(equipment);
    }

    private static void testVehicle(Vehicle vehicle) {
        System.out.println("Vehicle: " + vehicle.getRegistrationNumber());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Initial Mileage: " + vehicle.getMileage());
        System.out.println("Initial Fuel Level: " + vehicle.getFuelLevel());


        vehicle.drive(100);
        System.out.println("New Mileage after driving: " + vehicle.getMileage());
        System.out.println("Fuel Level after driving: " + vehicle.getFuelLevel());


        vehicle.refuel(20);
        System.out.println("Fuel Level after refueling: " + vehicle.getFuelLevel());

        System.out.println();
    }
}
