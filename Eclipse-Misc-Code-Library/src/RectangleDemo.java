import java.util.Scanner;
public class RectangleDemo {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//create first object
		Rectangle rec1 = new Rectangle ();
		rec1.display();
		
		//prompt user
		System.out.print("Enter the height: ");
		int h2 = input.nextInt(); 
		System.out.print("Enter the width: "); 
		int w2 = input.nextInt(); 
		
		//create second object
		Rectangle rec2 = new Rectangle (h2,w2);
		rec2.display();
		input.close();
	}

}
