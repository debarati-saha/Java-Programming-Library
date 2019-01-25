import java.util.Scanner;
public class MetricConversion {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//prompt user 
		int num;
		System.out.print("Enter a number: ");
		num = input.nextInt();
		//call methods
		inchesToCentimeter(num);
		gallonsToLiters(num);

	}
	/* name:
	 * input
	 * output:
	 */
	public static void inchesToCentimeter(int x) {
		System.out.printf("%d inches is equal to %.2f centimeter\n",x, x*2.54);
	}
	public static void gallonsToLiters(int x) {
		System.out.printf("%d gallons is equal to %.2f liters",x, x*3.7854);
	}
}
