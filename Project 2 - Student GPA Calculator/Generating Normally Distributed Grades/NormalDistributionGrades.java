import java.util.Random;

public class NormalDistributionGrades {

	public static void main(String[] args) {
		System.out.println("Letter grades are randomly generated as: ");
		for (int j=0; j<1000; j++) {
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
			System.out.println(letterGrade);
		}
	}

}
