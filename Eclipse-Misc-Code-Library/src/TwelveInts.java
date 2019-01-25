import java.util.Random;
public class TwelveInts {

	public static void main(String[] args) {
		//declare int array of length 12
		Random randGen = new Random();
		randGen.setSeed(10);
		int[] numArray = new int[12];
		
		for(int i = 0; i<numArray.length; i++) {
//			numArray[i] = (int)(Math.random()*90)+10;
			numArray[i] = randGen.nextInt(90) +10;
		}	
		for (int i = 0; i<numArray.length; i++) {
			System.out.print(numArray[i]+ " ");
		}
		System.out.println();
		for (int i = numArray.length - 1; i>=0; i--) {
			System.out.print(numArray[i]+ " ");
		}
		System.out.println();
	}

}
