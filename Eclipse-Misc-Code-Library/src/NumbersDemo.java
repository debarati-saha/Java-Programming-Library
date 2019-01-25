
public class NumbersDemo {

	public static void main(String[] args) {
		//declare and initialize all variables
		int num1 = 2;
		int num2 = 3;
		displayTwiceTheNumber(num1);
		displayTwiceTheNumber(num2);
		displayNumberPlusFive(num1);
		displayNumberPlusFive(num2);
		displayNumberSquared(num1);
		displayNumberSquared(num2);
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
