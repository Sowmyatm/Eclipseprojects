package day5;

class MultiplyFun1{
	//same type with 2 parameters
	static int Multiply(int a, int b) {
		return a*b;
	}
	//same type with 3 parameters
	static int Multiply(int a, int b, int c) {
		return a*b*c;
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MultiplyFun1.Multiply(3, 4));
		System.out.println(MultiplyFun1.Multiply(2,5,2));

	}

}
