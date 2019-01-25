import java.util.Scanner;
public class TryChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String firstname, middlename, lastname;
		char c, n, cc;
		System.out.print("Enter first name: ");
		firstname = input.next();
		System.out.print("Enter middle name: ");
		middlename = input.next();
		System.out.print("Enter last name: ");
		lastname = input.next();
		input.close(); 
		c = firstname.charAt(0);
		n = middlename.charAt(0);
		cc = lastname.charAt(0);
		//System.out.println("This is a: "+ (c + 3));
		System.out.println(c+"."+ n + "." + cc + ".");
		
	}

}
