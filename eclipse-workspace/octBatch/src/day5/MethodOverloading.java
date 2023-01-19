//Polymorphism in java allows the same method to perform different operations
//There are 2 types of polymorphism
  //a) Compile time(method overloading) --It decides what to run at compile time itself.
 //b) Run time (method overriding) -- Method binding will takes place in run time

//Example for method overloading

package day5;

class MultiplyFun{
	
	//Method with 2 parameter
	static int Multiply(int a, int b)
	{
		return a*b;
		
	}
	//method with same name with double parameter
	static double Multiply(double a, double b)
	{
		return a*b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
	
		System.out.println(MultiplyFun.Multiply(2,3));
		System.out.println(MultiplyFun.Multiply(2.2,3.2));

	}

}
