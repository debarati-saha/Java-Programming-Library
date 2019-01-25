
public class CountByFive {

	public static void main(String[] args) {
		for (int i = 1; i < 41; i++) {
			if (5*i%50 ==0)
				System.out.printf("%d\n", 5*i);
			else
				System.out.printf("%d\t",5*i);
		}

	}

}
