import java.util.Scanner;
public class AreaOfCircleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		//declare and initialize all variables
		double radius;
		//prompt user and get the value
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		input.close();
		
		area (radius);
		display(radius);
	}
	
	/*
	 * name: area
	 * input: double
	 * output: double
	 * description: this method finds the area of a circle
	 */
	public static double area (double x) {
		return x*x*Math.PI;
	}
	/*
	 * name: display
	 * input:
	 * output:
	 */
	public static void display (double x) {
		System.out.printf("The area of the circle of radius %.1f is %.2f.", x, area(x));
	}
}
