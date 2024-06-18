package JavaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		int wordlen = word.length();

		for (int i = 0; i < wordlen / 2; i++) {
			for (int j = wordlen - 1; j >= 0; j--) {
				if (word.charAt(i) == word.charAt(j)) {
					System.out.println("The String entered is a palindrome");
				} else {
					System.out.println("The string entered is not a palindrome");
				}
			}
		}
	}

}

//121 is palindrome
//155 is not palindrome