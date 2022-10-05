package arraysPrograms;

public class sumOfArray {
	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum=0;
		System.out.println("number present");
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i] + " ");

		}
		System.out.print("sum of all element = ");
		for (int i=0; i < a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println(+sum);
	}

}
