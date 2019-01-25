
public class CirclewithCenter extends Circle{
	private Center c;
	
	public CirclewithCenter() {
		super();
		c = new Center();
	}
	
	public CirclewithCenter(double radius) {
		super(radius);
		c=new Center();
	}
	public CirclewithCenter(double radius, double x, double y) {
		super(radius);
		c=new Center(x,y);
	}
	public void display() {
		c.display();
		super.display();
	}
}
