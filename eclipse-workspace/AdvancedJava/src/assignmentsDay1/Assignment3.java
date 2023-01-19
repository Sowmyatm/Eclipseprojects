package assignmentsDay1;

public class Assignment3 {

	public static void main(String[] args) {
		
		String str="I love java programming";
		String str1="o";
		
		str=str.replaceAll(" ", "");
		System.out.println(str);
		int first_index = str.indexOf(str1);
		int last_index = str.lastIndexOf(str1);
		
		System.out.println(last_index-first_index-1);
		
		
	}

}
