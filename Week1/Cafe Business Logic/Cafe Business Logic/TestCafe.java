import java.util.ArrayList;

public class TestCafe{

public static void main(String[] args) {
    CafeUtil cafeActions = new CafeUtil();

    int numWeeks= 10;
    // System.out.printf("Purchases needed by %d: is %s",numWeeks,cafeActions.getStreakGoal(numWeeks));

    double[] itemPrices= {5.5,6.8,4.3,8.2};
    // System.out.printf("Your total price for the drinks is: %s",cafeActions.getOrderTotal(itemPrices));

    ArrayList<String> menu = new ArrayList<String>();
    menu.add("espresso");
    menu.add("mocha");
    menu.add("machiatto");
    // cafeActions.displayMenu(menu);

    ArrayList<String> customers = new ArrayList<String>();
    for (int i = 0; i < 4; i++) {
            cafeActions.addCustomer(customers);
            System.out.println("\n");
        }



}

}