package day5;

class Parent{
	void print() {
		System.out.println("Print method of parent class");
	}
}

class subclass1 extends Parent{
	void print() {
		System.out.println("Print method of Subclass1 ");
	}
}

class subclass2 extends Parent{
	void print() {
		System.out.println("Print method of Subclass2");
	}
}

public class PolymorphismOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent a = new Parent();
		a.print();
		
		a = new subclass1();
		a.print();
		
		a=new subclass2();
		a.print();

	}

}
