package exam1;
import java.util.Scanner;
public class Q28_FactRecursion {

	public static long fact(int num) {
		
		if(num>=1)
			return num * fact( num-1);
		else
			return 1;
		
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an integer :");
			int a = sc.nextInt();

			//int num =5;
			long factorial= fact(a);
			System.out.println("Factorial of " + a + "=" + factorial);
			
			sc.close();

			}
		
		
	}


