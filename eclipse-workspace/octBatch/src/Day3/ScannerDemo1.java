package Day3;

import java.util.Scanner;

public class ScannerDemo1 {
	
		

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = reader.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = reader.nextInt();
		
		int sum = a+b;
		System.out.println("The sum is : " + sum);
		
		reader.close();
		
		

	}

}
