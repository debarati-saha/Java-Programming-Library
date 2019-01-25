import java.util.Scanner;
public class NumberDemo2 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//declare variables
		int num1, num2;
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		displayTwiceTheNumber(num1);
		displayTwiceTheNumber(num2);
		displayNumberPlusFive(num1);
		displayNumberPlusFive(num2);
		displayNumberSquared(num1);
		displayNumberSquared(num2);
		input.close();
	}
	/*
	 * name: displayTwiceTheNumber
	 * input: int, int
	 * output: 
	 * description: 
	 */
	public static void displayTwiceTheNumber(int a) {
		System.out.printf("output: %d\n", a*2);
	}
	/*
	 * name: displayNumberPlusFive
	 * input: int
	 * output: 
	 * description: 
	 */
	public static void displayNumberPlusFive(int a) {
		System.out.printf("Output: %d\n", a+5);
	}
	
	/*
	 * name: displayTwiceTheNumber
	 * input: int, int
	 * output: 
	 * description: 
	 */
	public static void displayNumberSquared(int p) {
		System.out.printf ("Output: %s\n", p*p);
	}
	

}
