//Method using arguments and return type

package Day3;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int largestNum=largest(20,19);
		int largestNum1= largest(100,400);
		
		System.out.println("The Largest number is " + largestNum);
		System.out.println("the largest number is " + largestNum1);
	}
	
	public static int largest(int x, int y) {
		
		int large;
		if(x>y)
			large = x;
		else
			large=y;
		
		return large;
		
	}

}
