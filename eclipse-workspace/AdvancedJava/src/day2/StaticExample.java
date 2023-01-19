package day2;

public class StaticExample {
	
	//Static block should be outside the main memory and executes first
	static {
		System.out.println("This is static block");
	}
	
	static String subject = "QA Automation";
	int RollNo;

	static void displaysubject() {
	System.out.println(subject);	
	}
	void printRollNo() {
		System.out.println(RollNo);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample s = new StaticExample();
		s.RollNo = 54;
		s.printRollNo();
		StaticExample.displaysubject();
		StaticExample s1 = new StaticExample();
		s1.RollNo = 8;
		s1.printRollNo();
		StaticExample.displaysubject();
		
		
	}

}
