import java.util.Scanner; 

public class MovieDemo {

	public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in); 
		int r1,r2,r3,r4,r5; 
		
		Movie m = new Movie("gone with the wind", 238);
		System.out.print("Rate " + m.getName() + ": ");
		r1 = input.nextInt(); 
		m.newRating(r1);
		
		System.out.print("Rate " + m.getName() + ": ");
		r2 = input.nextInt(); 
		m.newRating(r2);
		
		System.out.print("Rate " + m.getName() + ": ");
		r3 = input.nextInt(); 
		m.newRating(r3);
		
		System.out.print("Rate " + m.getName() + ": ");
		r4 = input.nextInt(); 
		m.newRating(r4);
		
		System.out.print("Rate " + m.getName() + ": ");
		r5 = input.nextInt(); 
		m.newRating(r5);
		
		m.display(); 
		
		System.out.println();
		input.nextLine();
		System.out.print("Enter the name of the next movie: ");
		String name = input.nextLine(); 
		System.out.print("Enter the length of the movie: "); 
		int length = input.nextInt(); 
		
	
		Movie m2 = new Movie(name, length);
		
		System.out.print("Rate " + m2.getName() + ": ");
		r1 = input.nextInt(); 
		m2.newRating(r1);
		
		System.out.print("Rate " + m2.getName() + ": ");
		r2 = input.nextInt(); 
		m2.newRating(r2);
		
		System.out.print("Rate " + m2.getName() + ": ");
		r3 = input.nextInt(); 
		m2.newRating(r3);
		
		System.out.print("Rate " + m2.getName() + ": ");
		r4 = input.nextInt(); 
		m2.newRating(r4);
		
		System.out.print("Rate " + m2.getName() + ": ");
		r5 = input.nextInt(); 
		m2.newRating(r5);
		
		m2.display(); 

	}

}
