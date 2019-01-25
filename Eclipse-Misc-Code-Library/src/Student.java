public class Student {
	//declare data fields
	private int studentID;
	private int creditHrs;
	private double points;
	
	//constructor
	public Student() {
		this.studentID = (int)(Math.random()*9000+1000);
		this.points = 0;
		this.creditHrs = 0;
	}
	public Student(double points, int creditHours) {
		this.studentID = (int)(Math.random()*9000+1000);
		this.points = points;
		this.creditHrs = creditHours;
	}
	
	//declare methods - gpa, display
	/*
	 * name: getGPA
	 * input: -
	 * output: double
	 */
	public double getGPA () {
		double GPA = points/creditHrs;
		return (GPA);
	}
	/*
	 * name: display
	 * input: - 
	 * output: void
	 */
	public void display() {
		System.out.println("Student info: ");
		System.out.printf("\t%-20s%5d\n","ID: ", this.studentID);
		System.out.printf("\t%-20s%5.2f\n","Points: ", this.points);
		System.out.printf("\t%-20s%5d\n","Credit Hours: ", this.creditHrs);	
		System.out.printf("\t%-20s%5.2f\n","GPA : ", getGPA());
		
	}
}
