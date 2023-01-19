package assignmentDay3;
import java.util.Scanner;
public class Palin {
	
	boolean ispalindrom_digit(int num) {
		int temp=num;
		int num_digits=0;
		
	while(temp!=0)
	{
		num_digits++;
		temp/=10;
	}
	temp=num;
	int digits[];
	digits = new int[num_digits];
	
	for(int i=0;i<num_digits;i++)
	{
		digits[i]=temp%10;
		temp/=10;
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
		
	
	boolean ispalindrom(int num) {
		String str=Integer.toString(num);
		for(int i=0,j=str.length()-1;i<j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return(false);
			}
		}
		return(true);
		
	}
	
	int check_howmnay_bool(boolean a, boolean b, boolean c)
	{
		int num_trues=0;
		if((a||b||c)==false)
		{
			return(0);
		}
		if(a)
		{
			num_trues++;
		}
		if(b)
			num_trues++;
		if(c)
			num_trues++;
		return(num_trues);
		
	}
	String reverse_str(String str)
	{
		String reversed_str="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			reversed_str=ch+reversed_str;
		}
		return(reversed_str);
	}
	public static void main(String[] args) 
	{
		Palin p1 = new Palin();
		Palin p2 = new Palin();
		Palin p3 = new Palin();
		int i=7879;
		if(p1.ispalindrom(i)== true)
		{
			System.out.println(i+" is a palindrome");
		}else
		{
			System.out.println(i+" is not a palindrome");

		}
		
		i=787;
		if(p1.ispalindrom_digit(i)== true)
			
		{
			System.out.println(i+" is a palindrome");
		}else
		{
			System.out.println(i+" is not a palindrome");

		}
			
		System.out.println(p2.reverse_str("Dukku"));
		
		System.out.println(p3.check_howmnay_bool(false, false, false));
		System.out.println(p3.check_howmnay_bool(false, true, false));
		System.out.println(p3.check_howmnay_bool(true, true, true));
	}
	

}
