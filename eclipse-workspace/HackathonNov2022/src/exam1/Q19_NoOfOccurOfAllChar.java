package exam1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q19_NoOfOccurOfAllChar {
public static void char_ct(String inputString)
    {
       
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        
        char[] strArr = inputString.toCharArray();//str to array conversion
 
       
        for (char c : strArr) {
            if (hm.containsKey(c)) {
 
                 hm.put(c, hm.get(c) + 1);//if char is already present increment the count by 1
            }
            else {
 
                hm.put(c, 1);//putting 1 as the value to the char inside the map
            }
        }
 
       for (Map.Entry<Character, Integer> entry : hm.entrySet()) {//print
            System.out.println(entry.getKey() + " " + entry.getValue());
      
       }
    }

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String str3 = sc.nextLine();
	String str = str3;
    char_ct(str);
    sc.close();
}
}


