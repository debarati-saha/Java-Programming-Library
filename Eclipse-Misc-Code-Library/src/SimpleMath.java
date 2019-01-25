import java.util.Scanner;
public class SimpleMath {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//read two numbers from the user: Double
		System.out.print("Enter two number: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		input.close();
		
		//compute
		/*double sum = number1 + number2;
		double subtract = number1 - number2;
		double product = number1 * number2;
		double division = number1 / number2;*/
		
		//display
		//System.out.println(number1 + " + " +number2 + " = "+ sum);
		sum(number1,number2);
		//System.out.println(number1 + " - " +number2 + " = "+subtract);
		diff(number1,number2);
		//System.out.println(number1 + " * " +number2 + " = "+product);
		mult(number1,number2);
		//System.out.println(number1 + " / " +number2 + " = "+division);
		div(number1,number2);
	}
	/*
	 * name: sum
	 * input: double, double
	 * output: double
	 * description: adding two numbers
	 */
	public static void sum (double x,double y) {
		double w = x + y;
		System.out.println(x + " + " + y + " = "+ w);
	}
	public static void diff (double x,double y) {
		double w = x - y;
		System.out.println(x + " - " + y + " = "+ w);
	}
	public static void mult (double x,double y) {
		double w = x * y;
		System.out.println(x + " * " + y + " = "+ w);
	}
	public static void div (double x,double y) {
		double w = x / y;
		System.out.println(x + " / " + y + " = "+ w);
	}
}
