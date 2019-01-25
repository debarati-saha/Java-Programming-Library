
public class CollegeCourse {
	//data fields
	private String courseId;
	private int credit;
	private char grade;
	
	//constructors
	public CollegeCourse(String courseId, int credit, char grade) {
		this.courseId = courseId;
		this.credit = credit;
		this.grade = grade;
	}
	
	//methods
	public char getGrade() {
		return grade;
	}
	public int getCreditHours() {
		return credit;
	}
	public void display() {
		System.out.printf("%-10s %d %2s\n", courseId, credit, grade);
	}
}
