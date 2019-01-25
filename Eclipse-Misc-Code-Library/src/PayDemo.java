import java.util.Scanner;
public class PayDemo {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner (System.in);
		
		//prompt user
		System.out.println("Enter skill level: ");
		int s=input.nextInt();
		System.out.println("Enter the hours worked: ");
		int hrs=input.nextInt();
		boolean mi = false,di =false,dsi = false,rp = false;
		//create object
		Pay p = new Pay (s, hrs);
		if (s>=2)
		{
		System.out.println("Do you like to have medical insurance? (yes/no) ");
		String answer = input.next().trim().toLowerCase();
		  if (answer.equals("yes")||answer.equals("y")) {
		    mi = true;
		     
		  } else if (answer.equals("no")||answer.equals("n")) {
		    mi = false;
		     
		  }else {
			     System.out.println("Sorry, I didn't catch that. Please answer y/n");
		  }
		System.out.println("Do you like to have dental insurance? (yes/no) ");
		answer = input.next().trim().toLowerCase();
		  if (answer.equals("yes")||answer.equals("y")) {
		    di = true;
		     
		  } else if (answer.equals("no")||answer.equals("n")) {
		    di = false;
		     
		  }else {
			     System.out.println("Sorry, I didn't catch that. Please answer y/n");
		  }
		System.out.println("Do you like to have Long-term disability insurance? (yes/no) ");
		answer = input.next().trim().toLowerCase();
		  if (answer.equals("yes")||answer.equals("y")) {
		    dsi = true;
		     
		  } else if (answer.equals("no")||answer.equals("n")) {
		    dsi = false;
		     
		  }else {
			     System.out.println("Sorry, I didn't catch that. Please answer y/n");
		  }
		if (s == 3) {
		System.out.println("Do you like to have retirement plan? (yes/no) ");
		answer = input.next().trim().toLowerCase();
		  if (answer.equals("yes")||answer.equals("y")) {
		    rp = true;
		     
		  } else if (answer.equals("no")||answer.equals("n")) {
		    rp = false;
		     
		  }else {
			     System.out.println("Sorry, I didn't catch that. Please answer y/n");
		  } 
		}
		}
		p.setDeduction(mi, di, dsi, rp);
		p.calPay();
		p.display();
	}

}
