//Average of 3 nos using scanner class
package assignmentDay3;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = number.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = number.nextInt();
		
		System.out.println("Enter the third number: ");
		int c = number.nextInt();
		
		int average = (a+b+c/3);
		System.out.println("Average is : " + average);
		
		number.close();

	}

	
		
	

	
	}


