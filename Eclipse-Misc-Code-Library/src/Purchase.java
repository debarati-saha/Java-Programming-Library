
public class Purchase {
	
	//data fields
	private int invoiceNumber;
	private double salesAmount;
	private double taxAmount;
	
	//constructor
	public Purchase (int invoiceNumber, double salesAmount) {
		this.invoiceNumber = invoiceNumber;
		this.salesAmount = salesAmount;
		this.taxAmount = this.salesAmount *0.05;
	}
	
	//methods
	public void display() {
		System.out.println("Purchase info: ");
		System.out.printf("\t%-20s %d\n", "Invoice Number: ",invoiceNumber);
		System.out.printf("\t%-20s %.2f\n", "Sales Amount: ", salesAmount);
		System.out.printf("\t%-20s %.2f\n", "Tax: ", taxAmount);
	}
}
