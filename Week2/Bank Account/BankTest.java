public class BankTest{
    public static void main(String[] args) {
        BankAccount darius = new BankAccount(500, 600);
        BankAccount silvana = new BankAccount(800, 200);
        BankAccount igor = new BankAccount(1000,500);


        darius.makeDeposit("checking", 3000);
        darius.makeWithdrawl("checking", 500);
        darius.makeDeposit("savings", 600);
        darius.makeWithdrawl("savings", 200);

        System.out.println(darius.getUserChecking());
        System.out.println(silvana.getUserSavings());
        System.out.println(igor.getUserChecking());
        darius.displayBalance();
        System.out.printf("\n # of total accounts: %d",BankAccount.getTotalAccounts());
        System.out.printf("\n Total amount in All accounts: %f",BankAccount.getTotalAmount());


    }
}