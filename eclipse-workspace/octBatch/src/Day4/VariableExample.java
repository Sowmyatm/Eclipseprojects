//concept of different variables

package Day4;

public class VariableExample {
	
	int myVariable;  //instance variable
	static int data = 30;  //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 300;  //local variable
		VariableExample obj= new VariableExample();
		
		System.out.println("Instance variable - myvariable: " +  obj.myVariable);
		System.out.println("Static variable - data: " + VariableExample.data);
		System.out.println("Local variable -  a : " +a);
		
		

	}

}
