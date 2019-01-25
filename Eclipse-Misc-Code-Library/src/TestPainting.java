import java.util.Scanner;
public class TestPainting {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//prompt user
		System.out.println("Enter Title: ");
		String title = input.nextLine();
		
		System.out.println("Enter Artist: ");
		String artist = input.nextLine();
		
		System.out.println("Enter Medium: ");
		String medium = input.nextLine();
		
		System.out.println("Enter Price: ");
		double price = input.nextDouble();
		
		//instantiate painting object
		Painting p1 = new Painting();
		p1.setTitle(title);
		p1.setArtist(artist);
		p1.setMedium(medium);
		p1.setPrice(price);
		p1.display();
	}

}
