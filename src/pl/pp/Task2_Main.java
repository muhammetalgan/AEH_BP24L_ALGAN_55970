package pl.pp;
import pl.pp.Task2_Person;
import pl.pp.Task2_Warehouse;

public class Task2_Main {
    public static void main(String[] args) {
        // Create Person instance
        Task2_Person owner = new Task2_Person("Muhammet", "muhammet@hotmail.com", "+90 5397964735");

        // Create Warehouse instance
        Task2_Warehouse warehouse = new Task2_Warehouse(1, 5000, owner);

        // Add goods
        warehouse.addGoods(3000);
        warehouse.addGoods(1000);
        warehouse.addGoods(2500);

        // Remove goods
        warehouse.removeGoods(1000);

        // Check occupancy
        warehouse.checkOccupancy();

        // Update contact details
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");

        // Trying to add goods beyond available space
        warehouse.addGoods(1000);
    }
}