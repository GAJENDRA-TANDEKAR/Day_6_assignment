package arraysPrograms;

public class arrayInReverseOrder {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(" array element ");

		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
        }
		for ( int i = array.length-1 ;i>=0;i--) {
			
			System.out.print(array[i]+ " ");
		System.out.println("array in reverse order");
		break;
		}

	}
}
