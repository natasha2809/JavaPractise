package JavaPrograms;

public class FibbonaciSeries {

	public static void main(String[] args) {

		int a = 0, b = 1, c = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println(c);

			a = b;
			b = c;
			c = a + b;
		}
	}

}

// 0 1 1 2 3 5 8 13 21 24
