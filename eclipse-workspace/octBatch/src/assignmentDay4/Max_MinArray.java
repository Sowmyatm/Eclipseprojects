package assignmentDay4;

public class Max_MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {67,8,24,23,9,100,90,3};
		int min = array[0];
		int max = array[0];
		int n = array.length;
		
		for(int i=0; i <n; i++) {
			if (array[i] <min) 
				min =array[i];
			
			if(array[i]>max) 
				max= array[i];
			
		}

		System.out.println("The Minimum element is :" + min);
		System.out.println("The Maximum element is :" + max);
	}
	

}
