import java.util.*;
public class RandomArray {

	public static void main(String[] args) {
		
		int[] numArray = new int[100];
		Random randGen = new Random();
		randGen.setSeed(0);
		Scanner input = new Scanner(System.in);
		boolean status = true;
		
		for(int i =0; i<numArray.length; i++) {
			numArray[i] = randGen.nextInt(20)-10;
		}
		do {
		try {
			System.out.print("Enter a number: ");
			int index = input.nextInt();
			System.out.println(numArray[index]);
			status = false;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter index between 0 and 99");
			input.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("Input mistach!");
			input.nextLine();
		}
		}while(status);
	}

}
