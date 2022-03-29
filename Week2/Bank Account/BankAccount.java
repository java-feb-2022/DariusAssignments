public class BankAccount {
    //class attributes
    private double checkingBalance;
    private double savingsBalance;

    //static members
    private static int totalAccounts =0;
    private static double totalAmount= 0.00;


    //Constructors
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance= checkingBalance;
        this.savingsBalance= savingsBalance;
        totalAccounts++;
        totalAmount+= this.checkingBalance+this.savingsBalance;
    }

    //GETTER & SETTER
    public double getUserChecking(){
        return this.checkingBalance;
    }
    public double getUserSavings(){
        return this.savingsBalance;
    }

    //Class Methods
    public void makeDeposit(String account, double amount){
        if (account == "checking"){
            this.checkingBalance+=amount;
            totalAmount+= amount;
        }
        else if(account == "savings"){
            this.savingsBalance+=amount;
            totalAmount+= amount;
        }
    }
    public void makeWithdrawl(String account, double amount){
        if( account== "checking"){
            this.checkingBalance-= amount;
            totalAmount-= amount;
        }
        else if(account== "savings"){
            this.savingsBalance-=amount;
            totalAmount-= amount;
        }
    }
    public void displayBalance(){
        System.out.printf("\n This is your balance statement, \n Your checking balance is: %.2f \n Your savings balance is: %.2f",this.checkingBalance,this.savingsBalance);
    }



    public static int getTotalAccounts(){
        return totalAccounts;
    }

    public static double getTotalAmount(){
        return totalAmount;
    }

}
