package exam1;
import java.util.Scanner;
import java.util.Arrays;

public class Q3_IntArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int arr_size = sc.nextInt();
		
		int[] array = new int[arr_size];  
		
		for(int i=0; i<arr_size; i++)  
		{   
		array[i]=sc.nextInt();  
		}  

		System.out.println("The given array is: "); 
		for (int num : array) 
		{ 
     	  System.out.print(num + " ");
		}
		Arrays.sort(array);
        System.out.println("\nThe sorted array is: ");
        for (int a : array) {
        System.out.print(a + " ");
        sc.close();
}
	}
}
