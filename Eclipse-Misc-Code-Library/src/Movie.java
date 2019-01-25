
public class Movie {
	
	//declare data fields
	private String movieName;
	private int length;
	private double rating;
	private int count;
	private double overallRating;
	
	//constructor
	public Movie(String n, int l) {
		this.movieName = n;
		this.length = l;
		this.rating = 0;
		this.count = 0;
		this.overallRating = 0;
	}
	
	//declare methods - getName, newRating, display

	/*
	 * name: getName
	 * input: -
	 * output: String
	 */
	public String getName() {
		return movieName;
	}

	/*
	 * name: newRating
	 * input: int
	 * output: void
	 */
	public void newRating(int r) {
		count = count + 1;
		rating = rating+r;
		overallRating = rating/count;
	}

	/*
	 * name: display
	 * input: -
	 * output: void
	 */
	public void display() {
		System.out.println("Movie information: ");
		System.out.printf("\t%s%s\n", "Movie name: ", movieName);
		System.out.printf("\t%s%d\n", "Length: ", length);
		System.out.printf("\t%s%.1f", "Rating: ",overallRating);
	}
}
