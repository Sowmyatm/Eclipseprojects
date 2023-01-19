package assignmentsDay3;
import java.util.Arrays;
import java.util.*;

public class SortLargestNum {
	long  largest_integer(Integer  my_array[]) {
		Arrays.sort(my_array, Collections.reverseOrder());
		String largest=Arrays.toString(my_array);
		largest=largest.replace(",", "");
		largest=largest.replace("[", "");
		largest=largest.replace("]", "");
		largest=largest.replace(" ", "");
		largest=largest.trim();
		long largest_int=Integer.parseInt(largest);
		return(largest_int);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long largest_inter;
		Integer array_of_integers[]= {3,30};
		Integer array_of_integers1[]= {1,2,3,4,4,9,6};
		SortLargestNum Obj = new SortLargestNum();
		largest_inter=Obj.largest_integer(array_of_integers);
		System.out.println(largest_inter);
		System.out.println(Obj.largest_integer(array_of_integers1));

	}

}
