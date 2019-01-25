import java.util.Scanner;
public class ShowStudent {

	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		
		//prompt user
		System.out.println("Enter Credit Hours: ");
		int hours = input.nextInt();
		
		System.out.println("Enter Points: ");
		double pts = input.nextDouble();
		
		//stu1.setCreditHrs(hours);
		//stu1.setPoints(pts);
		
		//instantiate student object
		Student stu1 = new Student(24,6);
		Student stu2 = new Student(pts,hours);
		Student stu3 = new Student();
		
		//display
		stu1.display();
		stu2.display();
		stu3.display();
		input.close();
	}

}
