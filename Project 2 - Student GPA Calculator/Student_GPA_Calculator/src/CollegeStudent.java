
public class CollegeStudent {
	//data field
	private int id;
	private CollegeCourse[] course;
	
	//constructor
	public CollegeStudent (int id) {
		this.id = id;
		course = new CollegeCourse [5];
	}
	
	//methods
	/*
	 * name: setCourse
	 * input: int/index, courseId, credit, grade
	 * output: void
	 */
	public void setCourse (int i, String courseID, int credit, char grade) {
		course[i] = new CollegeCourse(courseID,credit,grade);
	}
	/*
	 * name: getStudentID
	 * input: -
	 * output: int
	 */
	public int getStudentID() {
		return id;
	}
	/*
	 * name: getCollegeCourse
	 * input: int
	 * output: CollegeCourse
	 */
	public CollegeCourse getCollegeCourse (int i) {
		return course[i];
	}
	/*
	 * name: gpa
	 * input:
	 * output: double
	 */
	public double GPA() {
		double point = 0;
		double gradePoint = 0;
		int creditHours = 0;
		for (int i=0; i<5; i++) {
			switch(course[i].getGrade()) {
			case 'A': point = 4; break;
			case 'B': point = 3; break;
			case 'C': point = 2; break;
			case 'D': point = 1; break;
			case 'F': point = 0; break;
			default: System.out.println("Invalid Grade!");
			}
			gradePoint += point*course[i].getCreditHours();
			creditHours += course[i].getCreditHours();			
		}
		return (gradePoint/creditHours);
	}
	
	/*
	 * name: display
	 * input:
	 * output: void
	 */
	public void display() {
		System.out.printf("%-10s %d", "Student ID: ",id);
		System.out.println("\nCourse List: ");
		for (int i=0; i<5;i++) {
			course[i].display();
		}
		System.out.printf("%s %.2f\n","GPA: ",GPA());
	}

}
