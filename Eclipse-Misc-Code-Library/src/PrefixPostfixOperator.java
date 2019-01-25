
public class PrefixPostfixOperator {

	public static void main(String[] args) {
		int j = 5;
		int k = 6;
		if (j++ == k)
			System.out.println("True");
		else
			System.out.println("False");
		int a;
		for(a = 0; a < 5; ++a)
			System.out.print(a + " ");
		System.out.println("");
		int m, n;
		for(m = 0; m < 4; ++m);
			for(n = 0; n < 2; ++n);
				System.out.print(m + " " + n + " ");
		System.out.println("");
		int f,g;
		for(f = 1, g = 4; f < g; ++f, --g)
			System.out.print(f + " " + g + " ");
		
	}
}
