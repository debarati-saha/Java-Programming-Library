import java.util.*;
public class CreditCardCheckCriteria {
	static String cardType = "Invalid";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter card number: ");
		String credit = input.nextLine();
		checkCriteria(credit);
			System.out.println(cardType);

	}
	public static boolean checkCriteria(String cc) {
		int p = Integer.parseInt(cc.substring(0,1));
		boolean b = false;
		switch(p){
			case 4: cardType = "Visa card"; b = true; break;
			case 5: cardType = "MasterCard"; b = true; break;
			case 6: cardType = "Discover card";b = true; break;
			case 3: 
				switch(cc.substring(1,2)) {
					case "7":
						cardType = "American Express card";
						b = true;
				}
				break;
			default: b = false; break;
		}
		return b;		
	}
}
