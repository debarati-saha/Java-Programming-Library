import java.util.Scanner;
public class CircleDemo {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner (System.in);
		
		//prompt user
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
/*		while(radius < 0) {
			System.out.print("Invalid entry!\nEnter radius: ");
			radius = input.nextDouble();
		}	*/
		do {
			System.out.print("Invalid entry!\nEnter radius: ");
			radius = input.nextDouble();
		} while(radius<0);
		
		Circle c1 = new Circle (radius);
		c1.display();

	}

}
