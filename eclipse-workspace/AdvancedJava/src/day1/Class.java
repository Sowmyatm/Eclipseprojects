package day1;

public class Class {
	String s = "HEllo Java";
	void display(){
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c1 = new Class();
		c1.s = "Hello Python"; 
		c1.display();
		
		Class c2 =new Class();
		c2.display();
	}

}
