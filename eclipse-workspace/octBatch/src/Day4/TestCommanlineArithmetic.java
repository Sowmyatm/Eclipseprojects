package Day4;

public class TestCommanlineArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(args[0]);//parse or treat the first argument as integer
		int b = Integer.parseInt(args[1]);//parse or treat the second argument as integer
		
		char c = args[2].charAt(0);//it is okay that 3rd arg can be a string but i am intereseted in the 1st character of that string 
		
		if (c=='a') 
			System.out.println(a+b);
		else
			if(c=='s')
				System.out.println(a-b);
			else
				if(c=='m')
					System.out.println(a*b);
	}
	

	}


