package pl.pp;
public class Task2_Account {
    private String accountNumber;
    private double balance;
    private String ownerName;
    private String email;
    private String phoneNumber;


    public Task2_Account(String accountNumber, double balance, String ownerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void credit(double amount) {
        balance += amount;
        System.out.println("Deposit of PLN " + amount + " was made. New balance: PLN " + balance);
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew PLN " + amount + " from the account. Remaining balance: PLN " + balance);
        } else {
            System.out.println("Insufficient funds. You have PLN " + balance + " in your account.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Task2_Account account = new Task2_Account("123456", 1000.0, "John Doe", "john@example.com", "+1234567890");
        account.withdraw(900.0);
        account.credit(250.0);
        account.withdraw(50.0);
        account.withdraw(300.0);
    }
}
