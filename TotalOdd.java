package JavaPrograms;

public class TotalOdd {

	public static void main(String[] args) {

		System.out.println("The Total Number of Odd Numbers from 1 to 100 are");
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {

				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
