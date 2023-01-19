package assignmentDay4;

public class Array_Specific_Val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,4,5,10,20,5};
		int element=5;
		int n=array.length;
		for(int i =0; i < n; i++) {
			if(array[i]==element)
			{
				System.out.printf("The element %d is found at index %d :", array[i],i);
			
			}
		}
	}

}
 