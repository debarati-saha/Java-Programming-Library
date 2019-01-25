import java.util.Scanner;
public class MinutesConversion {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//declare and initialize all variables
		int minutes;
		double hours, days;
		
		//Prompt user
		System.out.print("Enter a number of minutes: ");
		minutes = input.nextInt();
		input.close();
		
		//compute
		hours =(double) minutes / 60;
		System.out.println("Hours: "+hours);
		days = (double)hours/24;
		System.out.println("Days: "+days);
		
		System.out.printf("Hours: %.1f\n", hours);
		System.out.printf("Days: %.3f\n", days);
	}

}
