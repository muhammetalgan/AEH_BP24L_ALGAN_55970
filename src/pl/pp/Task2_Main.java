package pl.pp;
import pl.pp.Task2_Account;
public class Task2_Main {
    public static void main(String[] args) {
        // Example usage
        Task2_Account account = new Task2_Account("010000010101001001010011110000000100111001000101\n", 900.0, "Arsene lupin", "arsene@lupin.com", "+4855223684");
        account.withdraw(900);
        account.credit(250.0);
        account.withdraw(50.0);
        account.withdraw(300.0);
    }
}
