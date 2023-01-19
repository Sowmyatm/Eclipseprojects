package assignmentDay3;
import java.util.Scanner;

public class ScannerExamples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner attribute = new Scanner(System.in);
		
		//String name = "";
		//String gender = "";
		
		System.out.println("Enter the name: " );
		String name = attribute.nextLine();
		
		System.out.println("enter the gender: " );
		String gender = attribute.nextLine();
		
		System.out.println("enter the address: " );
		String address = attribute.nextLine();
		
		
		
		System.out.println("The Name, Gender and Address is : " + name +" , " + gender + " , " + address);
		attribute.close();
		
		}

}
