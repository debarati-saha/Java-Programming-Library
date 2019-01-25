/*
 * name:
 * date:
 */
public class Painting {
	//data field
	private String title;
	private String artist;
	private String medium;
	private double price;
	private double commission;
	
	//Constructor(s)
	public Painting() {
		title = "";
		artist = "";
		medium = "";
		price = 0;
		commission = 0;
	}
	
	//methods (s) - get/set, countCom, display
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		title = t;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String a) {
		artist = a;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String m) {
		medium = m;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		price = p;
		commission = price * 0.20;
	}
	public void display() {
		System.out.println("Art Info: ");
		System.out.printf("\t%-20s %-15s\n", "Title: ",title);
		System.out.printf("\t%-20s %-15s\n", "Artist: ",artist);
		System.out.printf("\t%-20s %-15s\n", "Medium: ",medium);
		System.out.printf("\t%-20s $%-15.2f\n", "Price: ",price);
		System.out.printf("\t%-20s $%-15.2f\n", "Commission: ",commission);
	}
}
