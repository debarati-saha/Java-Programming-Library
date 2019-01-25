
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount ("Debarati Saha",10000);
		b1.display();
		b1.deposit(200);
		b1.display();
		b1.withdraw(100);
		b1.display();
		b1.deductMonthlyFee();
		b1.display();
		b1.explainAccountPolicy();
	}

}
