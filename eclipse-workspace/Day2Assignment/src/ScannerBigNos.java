import java.util.Scanner;
public class ScannerBigNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 3 numbers : ");
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		int c = Integer.parseInt(s.nextLine());
		String str = s.nextLine();
		System.out.println(str);
		if (a>b &&  a> c)
		{
			System.out.println(a + "is largest");
			
		}
		else if(b>a && b>c)
		{
			System.out.println(b + "is largest");
			
		}
		else {
			System.out.println(c + "is largest");
		}
	}

}
