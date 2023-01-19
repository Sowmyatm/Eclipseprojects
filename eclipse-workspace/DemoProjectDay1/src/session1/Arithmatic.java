package session1;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first = 100;
		int second = 200;
		int sum = first + second;
		
		float first1 = 44.224f;
		float second1= 22.12f;
		float diff = first1 - second1;
		
		double firstd = 11.2333;
		double secd = 14.22;
		double sumd = firstd+secd;
		
		float typecast = sum; //automatic typecasting
		float narrowcast = (float)sumd;//manual typecasting
		
		System.out.println("The sum of integer is: " + sum + "\n");
		System.out.println("The difference of floating numbers is :" + diff +  "\n");
		System.out.println("The sum of double numbers is: " + sumd + "\n");
	
		System.out.println("AUTOMATIC TYPECASTED: " + typecast +"\n");
		System.out.println("manual typecasted: " + narrowcast + "\n");
		
	}
	

}
