package JavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number whose factorial is required");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
			System.out.println(fact + "*" + i + "=" + fact);
		}
		System.out.println("The factorial of " + num + "is" + fact);

		sc.close();

	}

}

// 4*3*2*1 = 24 