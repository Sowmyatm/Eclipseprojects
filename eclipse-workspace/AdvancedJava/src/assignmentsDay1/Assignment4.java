package assignmentsDay1;

public class Assignment4 {

	public static void main(String[] args) {
		String str= "Hello Java 8";
		
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
	}

}
