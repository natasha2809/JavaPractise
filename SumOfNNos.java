package JavaPrograms;

import java.util.Scanner;

public class SumOfNNos {

	public static void main(String[] args) {

		System.out.println("Input a Number");
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int sum = 0;
		for (int i = 0; i <= N; i++) {
			sum = sum + i;

		}
		System.out.println("Sum of N numbers is " + sum);

		scan.close();

	}

}
