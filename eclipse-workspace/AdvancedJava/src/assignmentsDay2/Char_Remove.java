package assignmentsDay2;

public class Char_Remove {
	
	String char_remove(String str , int n) {
		
		
		String str1  = str.substring(0, n);
		String str2 = str.substring(n+1, str.length());
		
		return (str1+str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Char_Remove mystr = new Char_Remove();
		
		System.out.println(mystr.char_remove("Sowmya",3));
	}

}
