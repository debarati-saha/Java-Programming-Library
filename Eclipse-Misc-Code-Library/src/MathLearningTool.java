import java.util.Scanner;
import java.util.Random;
public class MathLearningTool {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		//create Random
		Random randGen = new Random();
		int num1 = randGen.nextInt(10);
		int num2 = randGen.nextInt(10);
		int count = 0;
		//create a simple addition question
		System.out.print(num1 + "+" + num2 + "=");
		int sum = input.nextInt();
		while (sum != num1+num2) {
			count = count +1;
			System.out.print(num1 + "+" + num2 + "=");
			sum = input.nextInt();
		}
		System.out.println("Correct after "+ count+ " attempt(s)\n");
		count = 0;
		//create a simple subtraction question
		num1 = randGen.nextInt(10);
		num2 = randGen.nextInt(num1+1);
		System.out.print(num1 + "-" + num2 + "=");
		int sub = input.nextInt();
/*		if(sub == num1-num2) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Wrong!");
		} */
		while (sub != num1 - num2) {
			count = count +1;
			System.out.print(num1 + "-" + num2 + "=");
			sub = input.nextInt();
		}
		System.out.println("Correct after "+ count+ " attempt(s)\n");
	}

}
