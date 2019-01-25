import java.util.Scanner;
public class JobApplicantDemo {

	public static void main(String[] args) {
		
		JobApplicant ja = new JobApplicant("Dave Ross","123-456-7890", true, true,true, true);
		ja.display();
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter applicant's name:");
		String name = input.next();
		
		System.out.println("Enter applicant's phone number:");
		String phone = input.next();
		
		System.out.println("Enter applicant's skills(Yes/no):");
		System.out.println("Word Processing: ");
		String wordProcessing = input.next();
		boolean wp = false;
		
		if(wordProcessing.equalsIgnoreCase("yes"))
			wp = true;
		
		System.out.print("Spreadsheets");
		String spreadSheets = input.next();
		boolean ss = false;
		
		if(spreadSheets.equalsIgnoreCase("yes"))
			ss = true;
		System.out.print("Database");
		String dataBase = input.next();
		boolean db = false;
		
		if(dataBase.equalsIgnoreCase("yes"))
			db = true;
		System.out.print("Graphics");
		String graphics = input.next();
		boolean gr = false;
		
		if(graphics.equalsIgnoreCase("yes"))
			gr = true;
		
		JobApplicant applicant2 = new JobApplicant(name, phone, wp, ss, db, gr);
		applicant2.display();

	}

}
