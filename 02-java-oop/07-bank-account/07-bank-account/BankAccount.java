import java.util.Random;

public class BankAccount {
    public static int Accounts = 0;
    public static double allFunds = 0;

    private static String makeId() {
        String accountNumber = "";
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            accountNumber += r.nextInt(10);
        }
        return accountNumber;
    }

    private String accountNumber;
    private double checkBalance;
    private double savingsBalance;

    public BankAccount() {
        BankAccount.Accounts += 1;
        this.checkBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = BankAccount.makeId();
    }

    public double getCheckBalance() {
        return this.checkBalance;
    }

    public double getSavingBalance() {
        return this.savingsBalance;
    }

    public void depositMoney(double amount, String account) {
        if (account.equals("savings"))
            this.savingsBalance += amount;
        else if (account.equals("checking"))
            this.checkBalance += amount;
        BankAccount.allFunds += amount;
    }

    public void withdrawMoney(double amount, String account) {
        boolean successful = false;
        if(account.equals("savings")) {
            if(this.savingsBalance - amount >= 0) {
                successful = true;
                this.savingsBalance -= amount; 
            }
        }
        else if(account.equals("checking")) {
            if(this.checkBalance - amount >= 0) {
                successful = true;
                this.checkBalance -= amount;
            }
        }
        if(true) {
            BankAccount.allFunds -= amount;
        }
            }

    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkBalance));
    }

}
