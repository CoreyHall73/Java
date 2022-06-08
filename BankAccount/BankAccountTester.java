

public class BankAccountTester {
    
    // Entry Point
    public static void main(String[] args) {

        // Make User
        BankAccount user = new BankAccount();

        // Deposit
        user.deposit("Checking", 100.10);
        user.deposit("Savings", 100.10);

        // Withdraw
        user.withdrawChecking(180.10);

        // Get User Checking
        System.out.println(user.getChecking());

        // Get user Savings
        System.out.println(user.getSavings());

        // Get user Savings and Checking Total
        System.out.println(user.getBoth());
    }
}
