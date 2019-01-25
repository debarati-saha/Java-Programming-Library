import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner (System.in);
		//prompt user 
		System.out.println("Enter number: ");
		int num = input.nextInt();
		// compute and display even odd
		if (num%2 == 0) {
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
	}

}
