import java.util.Scanner;
public class LetterGrade1 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner (System.in);
		
		//prompt user
		System.out.print("Enter score: ");
		int score = input.nextInt();
		if ((score >=0) && (score<=100 )) {
			//compute and display letter grade
			if (score>=90) 
				System.out.println("A");
			
			else if(score>=80) 
				System.out.println("B");
				
			else if (score >= 70) 
				System.out.println("C");
					
			else {
				System.out.println("F");
			}		
		}
		else {
			System.out.println("Score is out of range of 0 to 100");
		}
		
	}

}
