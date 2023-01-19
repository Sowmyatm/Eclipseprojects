package Day4;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] =  {{11,22,33},{33,22,11}};
		int b[][]= {{33,22,11},{11,22,33}};
		int c[][] = new int[2][3];
		
		System.out.println("Array - A:");
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" " + a[i][j]);
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Array - B:");
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" " + b[i][j]);
				
			}
			System.out.println();

		}
		
		System.out.println();
		System.out.println("Sum of two arrays A and B is -C:");
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(" " + c[i][j]);
				
			}
			System.out.println();

		}
		

}
}
