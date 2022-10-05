package day6Array;

public class CopyOneToAnotherArray {
	public static void main(String[] args) {

		int[] a1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] a2 = new int[a1.length];

		for (int i = 0; i < a1.length; i++) { // for loop
			a2[i] = a1[i];
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");

		}
		System.out.println(" copyed a1 to a2 element");
		for (int i = 0; i < a1.length; i++) { // foe each loop
			System.out.print(i + "  ");
		}

	}
}