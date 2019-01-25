import java.util.*;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		//declare and initialize all variables
		final double PI= Math.PI;
		double radius = 0;
		double area;
		boolean status = true;
		//prompt user and get the value
		do {
		try {
			System.out.print("Enter radius: ");
			radius = input.nextDouble();
			status = false;
			//compute area of circle
			area = radius * radius * PI;
			
			//display output
			/*System.out.print("Area of the circle of radius ");
			System.out.print(radius);
			System.out.print(" is ");
			System.out.println(area);
			*/
			System.out.print("The area of the circle of radius " + radius + " is " + area + ".");
		}catch(InputMismatchException e) {
			System.out.println("Input value should be numerival value! ");
			input.nextLine();
			
		}
		}while(status);
		input.close();

	}

}
