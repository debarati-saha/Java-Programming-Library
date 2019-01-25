import java.util.*;
public class AscendingAndDescending {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		//prompt user
		System.out.print("Enter three integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int temp = 0;
		if (num1 > num2) {
			if (num1 < num3) {
				temp = num1;
				num1 = num3;
				num3 = temp;
			}
		}
		else if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			if (num1 < num3) {
				temp = num1;
				num1 = num3;
				num3 = temp;
			}
			
		}
		if (num2< num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
			
		System.out.print(num1+ " " +num2+ " "+ num3);
		input.close();
	}

}
