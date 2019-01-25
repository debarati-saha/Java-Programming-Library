
public class CarRentalDemo {

	public static void main(String[] args) {
		CarRental car = new CarRental ("James","75080","luxury",10);
		car.display();
		
		CarRental luxuryCar = new LuxuryCarRental ("Ron","75033","luxury",12, true);
		luxuryCar.display();

	}

}
