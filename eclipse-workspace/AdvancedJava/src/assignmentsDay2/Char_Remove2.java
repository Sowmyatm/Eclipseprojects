package assignmentsDay2;

public class Char_Remove2 {

	String char_remove(String str1, String str2) {
		String str3 = str1.substring(1, str1.length());
		String str4 = str2.substring(1, str2.length());
		String str = str3+str4;
		return(str);
		
	}
	public static void main(String[] args) {
		Char_Remove2 obj = new Char_Remove2();
		System.out.println(obj.char_remove ("Sowmya", "Prasanna"));

	}

}
