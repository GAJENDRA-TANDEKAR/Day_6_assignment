package day6Array;

public class LargestElment {
	public static void main(String[] args) {
		int[] a1 = new int[] { 55, 22, 66, 33, 99, 55, 88, };
		int a2 = a1[0];
		for (int i = 0; i < a1.length; i++) {

			if (a1[i] > a2)
				a2 = a1[i];
		}
		System.out.println("smallest element = " + a2);
	}

}
