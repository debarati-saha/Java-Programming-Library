
public class BankAccount {
 private int accNo;
 private String owner;
 private double balance;
 //constructor
 public BankAccount(String o, double b) {
	 this.accNo = (int)(Math.random()*90000+10000);
	 this.owner = o;
	 this.balance = b;
 }
 //methods
 public void deductMonthlyFee() {
	 this.balance = this.balance - 4;
 }
 public void display() {
	 System.out.println("Account Info: ");
	 System.out.printf("\t%-20s%-15d\n","Account No: ", accNo);
	 System.out.printf("\t%-20s%-15s\n","Owner name: ", owner);
	 System.out.printf("\t%-20s%-15.2f\n","Account Balance", balance);
 }
 public static void explainAccountPolicy() {
	 System.out.println("$4 service fee will be deducted each month");
 }
 public void deposit (double d) {
	 this.balance += d;
 }
 public void withdraw(double w) {
	 this.balance -= w;
 }
}
