package assignmentDay4;
import java.util.Arrays;

public class Num_String_Array_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int my_array1[] = {20,50,10,40,100,48};
		String my_array2[] = {"Phython", "Java", "Cobol", "C", "OOPS"};
		
		System.out.println("Original string array :" + Arrays.toString(my_array1) );
	    Arrays.sort(my_array1);
	    System.out.println("Sorted string array :"+ Arrays.toString (my_array1));
	    
	    System.out.println("Original string array : " +  Arrays.toString(my_array2));
	    Arrays.sort(my_array2);
	    System.out.println("Sorted string array : "+ Arrays.toString (my_array2));

}
}
