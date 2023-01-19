package assignmentsDay3;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner my_arr = new Scanner(System.in);
		int n;
		System.out.println("Array length: " );
		n = my_arr.nextInt();
		int a[] = new int[n*(n+1)/2];
		int b = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				a[b]= j;
				b++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i<a.length-1) {
				System.out.print(",");
			}
		}
		my_arr.close();
	}

}
