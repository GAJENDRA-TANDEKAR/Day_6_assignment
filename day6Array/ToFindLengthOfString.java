package day6Array;

import java.util.Scanner;

public class ToFindLengthOfString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the string = ");
		String read = scan.nextLine();
		int length = read.length();
		System.out.println(" length = " + length);

		if (length % 2 == 0) {
			System.out.println(" the length is even  ");
		} else {
			System.out.println(" the length is odd ");
		}

		ToFindLengthOfString obj = new ToFindLengthOfString();
		obj.pattern();

	}

	void pattern() {
		int i, j;
		for (i = 0; i < 5; i++) {
			for (j = 1; j <= i+1; j++) {
				System.out.print("1");
			}
			System.out.println(" ");
		}

	}
}

/*
 * 1 11 111 1111 11111
 */