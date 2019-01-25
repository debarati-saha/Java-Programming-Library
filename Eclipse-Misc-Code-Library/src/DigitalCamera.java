
public class DigitalCamera {
	//data field
	private String brand;
	private int megapixels;
	private double price;
	//constructor
	public DigitalCamera(String b, int mp) {
		this.brand = b;
		this.megapixels = Math.min(10, mp);
		if (this.megapixels >6)
			this.price = 129;
		else
			this.price = 99;
	}
	//methods - display
	/*
	 * name: display
	 * input: -
	 * output:void
	 */
	public void display() {
		System.out.println("Digicam info: ");
		System.out.printf("\t%-20s%5s\n","Brand: ", brand);
		System.out.printf("\t%-20s%5d\n","Resolution: ", megapixels);
		System.out.printf("\t%-20s%5.2f\n","Price: $", price);	
	}
}
