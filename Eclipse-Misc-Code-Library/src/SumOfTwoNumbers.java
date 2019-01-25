import java.util.*;
public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// data fields
		Scanner input = new Scanner (System.in);
		boolean status = true;
		do {
		try {
			System.out.println("Enter two integer number: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			status = false;
			System.out.println(num1 + "+" + num2 + "=" + (num1+ num2));

			
		}catch(InputMismatchException e) {
//			System.out.println(e.getMessage());
			System.out.println("Invalid Input! Input should be integer value.");
			input.nextLine();
		}
		}while (status);


	}

}
