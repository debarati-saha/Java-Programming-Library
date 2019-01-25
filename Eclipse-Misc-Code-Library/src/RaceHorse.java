
public class RaceHorse extends Horse{
	//data fields
	protected int noOfRaces;
	public RaceHorse(String name, String color, int birthYear, int noOfRaces) {
		super(name, color, birthYear);
		this.noOfRaces = noOfRaces;
	}
	public void display() {
		super.display();
		System.out.printf("\t%-10s %d\n","No of Races: ",noOfRaces);
	}

}
