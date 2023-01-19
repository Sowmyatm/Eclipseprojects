package assignmentDay3;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner integer =new Scanner(System.in);
	
	System.out.print("Enter an integer: \n" );
	int a = integer.nextInt();
	
	System.out.println("Enter an floating number: " );
	float b = integer.nextFloat();
	
	System.out.println("Enter an double integer: " );
	integer.nextDouble();
	
	System.out.println("Enter a boolean value: " );
	integer.nextBoolean();
	
	float sum = a+  b;
	System.out.println("The sum is: " + sum);
	
	integer.close();
	
	}
	

}
