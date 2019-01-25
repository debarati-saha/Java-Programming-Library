import java.util.Scanner;
public class EvenEntryLoop {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner (System.in);
		//prompt user
		System.out.print("Enter number: ");
		int num = input.nextInt();
		while (num!=999) {
			// if num is even -> good job
			if (num%2 == 0)
				System.out.println("Good job!");
			// else error
			else {
				System.out.println("Not an even number!");
			}
			//prompt user again
			System.out.print("Enter number: ");
			num = input.nextInt();
		}
		System.out.println("done!");
	}

}
