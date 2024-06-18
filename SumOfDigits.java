package JavaPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		System.out.println("Enter a number ");
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		int sum = 0, reminder;
		while (Num > 0) {
			reminder = Num % 10;
			sum = sum + reminder;
			Num = Num / 10;

		}
		System.out.println("The sum of digits is : " + sum);

	}

}
