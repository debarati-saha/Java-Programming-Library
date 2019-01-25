import java.util.Scanner;
public class PurchaseDemo {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner (System.in);
		
		//prompt user

		int invoiceNumber;
		double salesAmount;
		do {
			System.out.print("Enter invoice number: ");
			invoiceNumber = input.nextInt();
		}while (invoiceNumber < 1000 || invoiceNumber > 8000);
		
		do {
		System.out.println("Enter sales amount: ");
		salesAmount= input.nextDouble();
		}while (salesAmount < 0);
		//create object 
		Purchase p = new Purchase(invoiceNumber, salesAmount);
		p.display();
		//

	}

}
