package exam1;
import java.util.Scanner;
public class Q20_UpLowNoOfDig {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string: ");
		String str= sc.nextLine();
		
		int upper_count, lower_count,digit_count;
		upper_count=lower_count=digit_count=0;
		
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)) == true)
			{
				digit_count++;
			}
			else if(Character.isLowerCase(str.charAt(i)) == true)
				{
					lower_count++;
				}
			else if(Character.isUpperCase(str.charAt(i)) == true)
			{
				upper_count++;
			}
				
		}
		System.out.println("Num of Digits: " + digit_count);
		System.out.println("Num of Upper case: " + upper_count);
		System.out.println("Num of Lower case: " + lower_count);
		sc.close();
	}

}


	