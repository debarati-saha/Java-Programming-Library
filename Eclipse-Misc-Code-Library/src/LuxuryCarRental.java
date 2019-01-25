
public class LuxuryCarRental extends CarRental{
	//data fields
	private boolean chauffeur;
	public LuxuryCarRental(String name, String zip, String size, int length, boolean chauffeur) {
		super (name, zip, size, length);
		if (size.equalsIgnoreCase("luxury"))
			super.dailyFee = 79.99;
		this.chauffeur = chauffeur;
		if(chauffeur) {
			super.totalFee = super.length*(super.dailyFee+200);
		}
		else
			super.totalFee = super.length * super.dailyFee;
	}
	/*
	 * name: display
	 * input:
	 * output:
	 */
	public void display() {
		String out;
		if(chauffeur)
			out = "Yes";
		else
			out = "No";
		super.display();
		System.out.printf("%-20s %s", "Chauffeur included: ", out);
	}

}
