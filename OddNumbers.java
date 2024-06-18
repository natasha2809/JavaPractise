package JavaPrograms;

public class OddNumbers {

	public static void main(String[] args) {

		System.out.println("The Odd Numbers between 1 and 100 are as below: ");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
