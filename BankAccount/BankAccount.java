

public class BankAccount {

    // Member Variables
    private double checking;
    private double savings;
    private static int numOfAccounts = 0;
    private static double totalMoney = 0.00;

    // Constructor
    public BankAccount() {
        this.checking = 0.00;
        this.savings = 0.00;
        numOfAccounts++;
        totalMoney = totalMoney + (this.checking + this.savings);
    }

    // Get Methods
    public double getChecking() {
        return this.checking;
    }

    public double getSavings() {
        return this.savings;
    }

    // Set Methods
    public void deposit(String type, double amount) {
        if (type == "Checking") {
            this.checking += amount;
        } else {
            this.savings += amount;
        }
    }

    public void withdrawChecking(double amount) {
        if (amount < this.checking) {
            this.checking -= amount;
        } else {
            System.out.println("You Broke");
        }
    }

    // Add Savings and Checking
    public double getBoth() {
        return this.checking + this.savings;
    }
}
