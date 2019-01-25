
public class Horse {
	//data fields
	protected String name;
	protected String color;
	protected int birthYear;
	//constructor
	public Horse(String name, String color, int birthYear) {
		this.name = name;
		this.color = color;
		this.birthYear = birthYear;
	}
	//methods
	public void setName(String newName) {
		name = newName;
	}
	public int getYear() {
		return birthYear;
	}
	public void display() {
		System.out.println("-----Horse Info------");
		System.out.printf("\t%-10s %s\n", "Name: ", name);
		System.out.printf("\t%-10s %s\n", "Color: ", color);
		System.out.printf("\t%-10s %d\n", "Birth Year: ", birthYear);
	}
}
