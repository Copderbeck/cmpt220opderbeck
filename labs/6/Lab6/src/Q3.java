
public class Q3 {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Account Statement");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.print("Balance: $");
		System.out.println(account.getBalance());
		System.out.print("Intrest: $");
		System.out.println(account.getMonthlyInterest());
	}
}
