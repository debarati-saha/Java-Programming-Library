
public class Center {
	//data fields
	private double x;
	private double y;
	//constructors
	public Center() {
		this.x= 0;
		this.y = 0;
	}
	public Center(double x, double y) {
		this.x= x;
		this.y = y;
	}
	//methods
	public void display() {
		System.out.println("Center: ("+x+ ","+y+")");
	}
}
