
public class Perfect {

	public static void main(String[] args) {
	//for loop
		//if number is perfect
			//print
		for (int i = 1; i <= 1000; i++) {
			if(isPerfect(i))
				System.out.print(i + " ");
	}
	}
	/*
	 * name: isPerfect
	 * input: int
	 * output: boolean
	 */
	public static boolean isPerfect (int i) {
		int sum =0;
		for (int j = 1; j <= (i/2); j++) {
			if (i % j ==0)
				sum  = sum + j;
		}
		if (sum == i)
			return true;
		else
			 return false;
	}

}
