import java.util.Random;
import java.util.Scanner;
public class ArrayMethodDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//declare int array of length 10
		Random randGen = new Random();
		randGen.setSeed(0);
		int[] numArray = new int[10];
		
		for(int i = 0; i<numArray.length; i++) {
			numArray[i] = randGen.nextInt(90) +10;
		}
		displayStraight (numArray);
		displayReverse (numArray);
		sum (numArray);
		System.out.print("Enter limiting arguments: ");
		int arg = input.nextInt();
//		int arg2 = input.nextInt();
		lessThan(arg,numArray);
		

	}
	public static void displayStraight (int[] nm) {
		for (int i = 0; i<nm.length; i++) {
			System.out.printf("%-3d",nm[i]);
		}
		System.out.println();
	}
	public static void displayReverse (int[] nm) {
		for (int i = nm.length - 1; i>=0; i--) {
			System.out.printf("%-3d",nm[i]);
		}
		System.out.println();
	}
	public static void sum (int[] nm) {
		int sum = 0;
		for (int i = 0; i<nm.length; i++) {
			sum = sum + nm[i];
		}
		System.out.print("Sum = " +sum+ " ");
		System.out.println();
	}
	
	public static void lessThan(int arg, int[] nm) {
		System.out.println("Less than "+ arg + ":");
		displayStraight(nm);
		for (int i = 0; i<nm.length; i++) {
			if (nm[i]<arg)
				System.out.printf("%-3d",nm[i]);
			else
				System.out.printf("%-3s", " ");
		}
	}
	/*
	public static void higherThanAvg(int[] numArray) {
		double avg = (double)sum(numArray) / numArray.length;
		for (int i =0; i< numArray.length; i++) {
			
		}
	}
	*/

}
