import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		//prompt user
		System.out.print("Enter your birth year: ");
		int by = input.nextInt();
		System.out.print("Enter current year: ");
		int cy = input.nextInt();
		//call method
		premiumCalculation(by,cy);

	}
	/* name: premiumCalculation
	 * input:int
	 * output:
	 */
	public static void premiumCalculation(int x, int y) {
		int age = y - x;
		int decades = age / 10;
		double premium = (decades +15)*20;
		System.out.printf("Your premium amount would be $%.2f\n", premium);
	}
}
