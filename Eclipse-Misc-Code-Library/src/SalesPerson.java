
public class SalesPerson {
	//data fields
	private int id;
	private double amount;
	
	//constructor
	public SalesPerson (int id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	
	
	//method - display
	/*
	 * name: display
	 * input: 
	 * output: void
	 */
	public void display() {
		System.out.println("Sales person info: ");
		System.out.printf("\t%-10s %d\n", "ID: ", id);
		System.out.printf("\t%-10s %.2f\n", "Amount: ", amount);
	}
	
}
