/*
 * name: Debarati
 * version:
 * date: 9/12/2017
 */
public class Circle {
	//attributes
	protected double radius;
	//center - assume the center of all  circles are going to be (0,0)
	protected final double PI = Math.PI;
	
	
	//constructor
	public Circle() {
		radius = 1;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	//methods
	public void setRadius (double radius){
		//radius = newRadius;
		this.radius = radius;
	}
	/*
	 * name: area
	 * input: 
	 * output
	 */
	public double area(){
		return radius*radius*PI;
	}
	/*
	 * name: display
	 * input: 
	 * output
	 */
	public void display() {
		System.out.println("Radius " + radius);
		System.out.printf("Area: %.2f\n", area());
	}
}
