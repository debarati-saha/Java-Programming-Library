import java.util.Scanner;
public class LetterGrade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create scanner
		Scanner input = new Scanner (System.in);
		
		//prompt user
		System.out.print("Enter score: ");
		int score = input.nextInt();
		
		switch(score/10) {
		case 10:
			if (score>100) {
				System.out.println("Score is out of range!"); break;
			}
		case 9: System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		case 7: System.out.println("C"); break;
		case 6: case 5: case 4: case 3: case 2: case 1: case 0: System.out.println("F");
		default: System.out.println("Score is out of range!");
		
		}

	}

}
