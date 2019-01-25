
public class SalesPersonDemo {

	public static void main(String[] args) {
		SalesPerson[] sp1 = new SalesPerson [10];
		
		for(int i=0; i< sp1.length; i++) {
			sp1[i] = new SalesPerson(9999,0);
		}
		for(int i=0; i< sp1.length; i++) {
			System.out.println("Sales person "+ (i+1)+ ": ");
			sp1[i].display();
		}
		SalesPerson[] sp2 = new SalesPerson [10];
		for(int i=0; i< sp2.length; i++) {
			sp2[i] = new SalesPerson(i+111, 25000 + i*5000);
		}
		for(int i=0; i< sp2.length; i++) {
			System.out.println("Sales person "+ (i+1)+ ": ");
			sp2[i].display();
		}
	}

}
