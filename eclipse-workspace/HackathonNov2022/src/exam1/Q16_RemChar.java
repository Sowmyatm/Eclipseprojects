package exam1;

import java.util.Scanner;
public class Q16_RemChar {
	
		
		String char_remove(String str , int n) {
			
			
			String str1  = str.substring(0, n);
			String str2 = str.substring(n+1, str.length());
			
			return (str1+str2);
		}

		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String str3 = sc.nextLine();

			System.out.println("Enter the index : ");
			int a = sc.nextInt();
			Q16_RemChar mystr = new Q16_RemChar();
			System.out.println(mystr.char_remove(str3 , a));
			sc.close();
		}

	}



	