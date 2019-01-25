import java.util.Scanner;
public class Initials {

	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//declare and initialize all variables
		String firstname, middlename, lastname;
		char c, n, cc;
		
		//prompt user and get the value
		System.out.print("Enter first name: ");
		firstname = input.next();
		System.out.print("Enter middle name: ");
		middlename = input.next();
		System.out.print("Enter last name: ");
		lastname = input.next();
		input.close();
		
		//save initials in variables
		c = firstname.charAt(0);
		n = middlename.charAt(0);
		cc = lastname.charAt(0);
		
		//print initials
		System.out.println(c+"."+ n + "." + cc + ".");
		
	}

}
