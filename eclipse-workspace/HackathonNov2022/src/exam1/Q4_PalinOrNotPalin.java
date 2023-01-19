package exam1;
import java.util.Scanner;


public class Q4_PalinOrNotPalin {
	
	boolean ispalindrom_digit(int num) {
		int temp=num;
		int num_digits=0;
		
	while(temp!=0)
	{
		num_digits++;
		temp=temp/10;
	}
	temp=num;
	int digits[];
	digits = new int[num_digits];
	for(int i=0;i<num_digits;i++)
	{
		digits[i]=temp%10;
		temp=temp/10;
	}
	for(int i=0,j=num_digits-1;i<j;i++,j--)
		
	{
		if(digits[i]!=digits[j])
		{
			return(false);
		}
	}
		return(true);
}
	
	public static void main(String[] args) 
	{
		Q4_PalinOrNotPalin p1 = new Q4_PalinOrNotPalin();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits: ");
		int a = sc.nextInt();
		
		if(p1.ispalindrom_digit(a)== true)
		{
			System.out.println(a+" is a palindrome");
		}else
		{
			System.out.println(a+" is not a palindrome");

		}
		sc.close();
		
			
			
		}
}




		
	
	

