public class BankAccountTest {
    public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.depositMoney(222.22, "checking");
		ba.depositMoney(533.00, "savings");
		ba.displayAccountBalance();

		System.out.println(BankAccount.allFunds);

		ba.withdrawMoney(70, "checking");
		ba.withdrawMoney(22, "savings");
		ba.displayAccountBalance();

		System.out.println(BankAccount.allFunds);
	}
}
