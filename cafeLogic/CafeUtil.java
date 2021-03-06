import java.util.Arrays;
import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal() {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            count += i;
        }
    return count;
    }

    public double getOrderTotal(double[] prices) {
        System.out.println(Arrays.toString(prices));
        double total = 0.0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customerNames) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.printf("There are %s people ahead of you", customerNames.size());
        customerNames.add(userName);
    }
}