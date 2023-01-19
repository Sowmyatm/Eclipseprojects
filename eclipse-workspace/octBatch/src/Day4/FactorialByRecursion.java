package Day4;

public class FactorialByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =5;
		long factorial= fact(num);

		System.out.println("Factorial of " + num + "=" + factorial);
		}
	
	public static long fact(int num) {
	
		if(num>=1)
			return num * fact( num-1);
		else
			return 1;
	}

}
