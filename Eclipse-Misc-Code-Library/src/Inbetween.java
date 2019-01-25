
import java.util.Scanner;

public class Inbetween {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		int count =0;

		System.out.println("Enter number: ");
		int num1 = input.nextInt();
		System.out.println("Enter number: ");
		int num2 = input.nextInt();
		if (num1 > num2) {
			int temp1 = num2;
			num2 = num1;
			num1 = temp1;
		}
		int temp = num1 + 1;
		if ((temp)>=num2) {
			System.out.print("No intergers between the entered values");
		}
		else {
			while ((temp)<num2) {
				temp ++;
				count ++;
			}
		System.out.println("There are "+ count + " intergers in between");
		}
		for (int i = num1+1; i < num2; i++) {
			System.out.print(i + "\t");
		}
	}

}
