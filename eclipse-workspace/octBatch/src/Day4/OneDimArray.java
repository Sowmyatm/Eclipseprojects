//to demonstrate one dimensional array

package Day4;

public class OneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 5;
		int a[] = new int [size]; // (array syntax) int a[] = new int[5]
		
		//storing values into different elements of an array
		for (int i=0; i <size; i++ ) {
			a[i] = i ;

	}
		//outputting elements of an array
		for(int j=0;j<size;j++) {
			System.out.println(a[j]);
		}

}
}
