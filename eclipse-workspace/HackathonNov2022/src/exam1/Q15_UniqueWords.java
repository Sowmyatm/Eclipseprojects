package exam1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q15_UniqueWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
	    
		String str = sc.nextLine();
	      String[] strArray = str.split("\s+");
	      Map<String, String> hMap = new LinkedHashMap<String, String>();
	      for(int i = 0; i < strArray.length ; i++ ) {
	         if(!hMap.containsKey(strArray[i])) {
	            hMap.put(strArray[i],"Unique");
	         }
	         else
	         {
	        	 hMap.put(strArray[i],"duplicate"); 
	         }
	      }
	      for(int i = 0; i < strArray.length ; i++ ) 
	      {
		         if(hMap.get(strArray[i])!="duplicate")
		         {
		            System.out.println(strArray[i]);
		            
		         }
	      }
	      sc.close();
	}
	
}
