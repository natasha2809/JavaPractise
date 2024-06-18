package JavaPrograms;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);

		String inpString = sc.nextLine();
		String revString = " ";
		int strlen = inpString.length();

		for (int i = strlen - 1; i >= 0; i--) {

			revString = revString + inpString.charAt(i);
		}
		System.out.println("Reversed String is " + revString);
	}

}
