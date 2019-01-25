
public class JobApplicant {
	//data field
	private String name;
	private String phone;
	private boolean wp, ss, db,gr;
	int count = 0;
	//constructor(s)
	 public JobApplicant(String n, String p, boolean wp, boolean ss, boolean db, boolean gr) {
		 this.name = n;
		 this.phone = p;
		 this.wp = wp;
		 this.ss = ss;
		 this.db = db;
		 this.gr = gr;
	 }
	//set of methods: isQualified(), display()
	/*
	 * name: isQualified
	 * input:-
	 * output: boolean
	 */
	public boolean isQualified() {
		if (wp) {
			
			count++;
		}
		if(ss) {
			count++;
		}
		if(db) {
			count =count +1;
		}
		if(gr) {
			count =count +1;
		}
		if (count >=3 ) 
			return true;
		
		else
			return false;
	}
	/*
	 * name: display
	 * input:
	 * output: void
	 */
	public void display () {
		System.out.println("Applicant info");
		System.out.printf("\t%-20s%5s\n","Name: ", this.name);
		System.out.printf("\t%-20s%5s\n","Phone number: ", this.phone);
		System.out.printf("\t%-20s%5b\n","Word Processing: ", this.wp);	
		System.out.printf("\t%-20s%5b\n","SpreadSheet : ", this.ss);
		System.out.printf("\t%-20s%5b\n","Database : ", this.db);
		System.out.printf("\t%-20s%5b\n","Graphics : ", this.gr);
		String answer = "No";
		if(isQualified())
			answer = "Yes";
		
		System.out.printf("\t%-20s%5s\n","Is the applicant qualified : ", answer);
	}
	
}
