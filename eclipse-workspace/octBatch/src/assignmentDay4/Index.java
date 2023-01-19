package assignmentDay4;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int array[] = {20,4,50,6,79,34};
			int n= array.length;
			int element = 34;
			for(int i=0;i<n;i++)
			{
				if(array[i] ==element)
				{
					System.out.println("The element is found at index:" + i);
				}
			}
	}

}
