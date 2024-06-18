package JavaPrograms;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		System.out.println("Enter a number of your choice");
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		int sum = 0, remin;
		int power = 0;

		while (Num > 0) {
			remin = Num % 10;
			sum = sum + remin;
			Num = Num / 10;

		}

		sc.close();

	}

}
