
public class CarRental {
	//data fields
	protected String name;
	protected String zip;
	protected String size;
	protected int length;
	protected double dailyFee;
	protected double totalFee;
	
	//constructor
	public CarRental(String name,String zip,String size,int length) {
		this.name = name;
		this.zip = zip;
		this.size = size;
		this.length = length;
		if(size.equalsIgnoreCase("economy"))
			dailyFee = 29.99;
		else if(size.equalsIgnoreCase("midsize"))
			dailyFee = 38.99;
		else if(size.equalsIgnoreCase("full size"))
			dailyFee = 79.99;
		else
			dailyFee = 0;
		
		this.totalFee = dailyFee*length;
		
	}
	//methods
	public void display() {
		System.out.println("------Car Rental Info-------");
		System.out.printf("%-20s %s \n", "ZipCode: ", zip);
		System.out.printf("%-20s %s \n", "Size: ", size);
		System.out.printf("%-20s $%.2f \n", "Daily Fee: ", dailyFee);
		System.out.printf("%-20s %d \n", "Length of rental: ", length);
		System.out.printf("%-20s $%.2f \n", "Total Fee: ", totalFee);
	}
}


