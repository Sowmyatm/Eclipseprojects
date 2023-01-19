package assignmentDay4;

public class Average_Of_All_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {3,6,8,10,5,9};
		int total = 0;
		int n=6;
		int average =0;
		
		for(int i =0; i<n ; i++)
		{
			total = total+array[i];
			average = (total/n);
		}

		System.out.println("The total of all elements is :" + total);
		System.out.println("The average of all elements is :" + average);
	}

}
