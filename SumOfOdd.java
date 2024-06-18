package JavaPrograms;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing the sum of Odd Nums");
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
	}

}
