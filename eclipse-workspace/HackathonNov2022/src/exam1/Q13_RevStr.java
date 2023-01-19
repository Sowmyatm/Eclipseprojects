package exam1;
import java.util.Scanner;
public class Q13_RevStr {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String str = sc.nextLine();
		
		Q13_RevStr revstr2 = new Q13_RevStr();
		System.out.println (revstr2.reverse_str(str));
		sc.close();
		
		
		}

}
