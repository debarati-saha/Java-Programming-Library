
import java.util.Scanner;
import java.util.Random;
public class InputGrades {

	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);

		CollegeStudent[] slist = new CollegeStudent[10];

		for (int i=0; i<10; i++) {
			//generate Student ID
			System.out.println("---------------Student " + (i+1)+ " input data:");
			Random randGen = new Random();
			int id = randGen.nextInt(89999)+10000;
			System.out.println("Student ID is randomly generated as: "+id);
			slist[i] = new CollegeStudent (id);
			
			for (int j=0; j<5; j++) {
				//prompt for course ID
				System.out.print("Enter Course ID " +(j+1)+ " for Student "+ (i+1) + ": ");
				String courseID = input.nextLine(); 
				
				//generate credit hours between {2,3,4}
				Random randGen1 = new Random();
				int credit = randGen1.nextInt(5-2)+2;
				System.out.println("Credit Hours is randomly generated as: " +credit);
				
				System.out.println("Letter grade is randomly generated as: "+ generateLetterGrade());
				slist[i].setCourse(j, courseID, credit, generateLetterGrade());
			}
			System.out.println();
		}
		
		//display
		System.out.println("---------------Display Student Array---------------");
		for (int i=0; i<10; i++) {
			slist[i].display();
		}
		
	}
	
	//method to randomly generate letter grades, which are normally distributed 
	//I generated 1000 grades using this method and exported it to excel to show the distribution. Please see the attached excel file
	public static char generateLetterGrade() {
		Random randGen2 = new Random();
		double score = 0;
		do {
			score = randGen2.nextGaussian()*8+82;
		} while (score >100); 

		char letterGrade = 0;
		switch((int)score/10) {
		case 10:
			if (score>100) {
				System.out.println("Score is out of range!"); break;
			}
		case 9: letterGrade = 'A'; break;
		case 8: letterGrade = 'B'; break;
		case 7: letterGrade = 'C'; break;
		case 6: letterGrade = 'D'; break;
		case 5: case 4: case 3: case 2: case 1: case 0: letterGrade = 'F'; break;
		default: System.out.println("Score is out of range!");
		
		}
		return letterGrade;
	}

}
