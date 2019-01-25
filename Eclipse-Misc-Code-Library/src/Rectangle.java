
public class Rectangle {
	//declare data fields
	private int height;
	private int width;
	
	//constructors
	public Rectangle () {
		this.height = (int)(Math.random()*99);
		this.width = (int)(Math.random()*99);
	}
	public Rectangle (int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	//declare methods - area, circumference, display
	/*
	 * name: area
	 * input: -
	 * output: int
	 */
	public int area() {
		return (this.height*this.width);
	}
	/*
	 * name: circumference
	 * input: -
	 * output: int
	 */
	public int circumference() {
		return (2*(this.height+this.width));
	}
	/*
	 * name: display
	 * input: -
	 * output: void
	 */
	public void display() {
		System.out.println("Rectangle infor: ");
		System.out.printf("\t%-20s%-5d\n","Height: ", this.height);
		System.out.printf("\t%-20s%-5d\n","Width: ", this.width);
		System.out.printf("\t%-20s%-5d\n","Circumference: ", circumference());	
		System.out.printf("\t%-20s%-5d\n","Area : ", area());
	}
}
