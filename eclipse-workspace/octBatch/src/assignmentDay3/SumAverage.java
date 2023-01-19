//To print the sum and average og 3 nos

package assignmentDay3;

import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numbers = new Scanner(System.in);
		
		System.out.println("Enter the 1st no: ");
		int a = numbers.nextInt();
		
		System.out.println("Enter the 2nd no: ");
		int b = numbers.nextInt();
		
		System.out.println("Enter the 3rd no: ");
		int c = numbers.nextInt();
		
		int sum = a+b+c;
		System.out.println("The sum of 3 numbers is: " + sum);
		
		float average = (a+b+c/3);
		System.out.println("The average of 3 numbers is: " + average);
		
		numbers.close();

	}

}
