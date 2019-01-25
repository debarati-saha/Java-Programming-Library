
public class Cylinder extends Circle{
	//data fields
	private double height;
		
	//constructor
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	//methods
	public double volume() {
		return super.area()*height;
	}
	public double area() {
		double value = 2*super.area();
		value = value+ 2*(super.radius)*(super.PI)*height;
		return value;
	}
	public void display() {
		System.out.println("Height: "+ height);
		System.out.println("Base circle - radius: "+super.radius);
		System.out.printf("Area:  %.1f\n", area());
		System.out.printf("Volume:  %.1f\n ", volume());
	}
}
