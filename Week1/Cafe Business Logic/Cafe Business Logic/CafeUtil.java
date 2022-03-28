import java.util.ArrayList;


public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int numOfPoints = 0;
        for(int i = 1;i<=numWeeks; i++){
            numOfPoints += i;
        }
        return numOfPoints;
    }

    public double getOrderTotal(double[]prices){
        double priceTotal= 0.0;
        for (int i=0; i<prices.length;i++){
            priceTotal +=prices[i];
        }
        return priceTotal;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<menuItems.size(); i++){
            System.out.println(i+menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String userName= System.console().readLine();
        System.out.printf("Hello, %s",userName);
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        for (int i=0; i<customers.size(); i++){
            System.out.println(i + " " + customers.get(i));
        }
    }
}
