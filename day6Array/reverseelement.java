package day6Array;

public class reverseelement {
	public static void main(String[] args) {  
         
        int [] a1 = new int [] {9,8,7,6,5,4,3,2,1};  
        System.out.println("Original array: ");  
        for (int i = 0; i < a1.length; i++) {  
            System.out.print(a1[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        
        for (int i = a1.length-1; i >= 0; i--) {  
            System.out.print(a1[i] + " ");  
        }  
    }  
}  


