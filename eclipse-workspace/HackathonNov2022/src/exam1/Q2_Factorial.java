package exam1;
import java.util.Scanner;
public class Q2_Factorial {

	public static void main(String[] args) {
		int mul = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			mul = mul*i;
		
		}
		System.out.println("factorial of "+n+" : " + mul);
		sc.close();
		}
	
	
}
