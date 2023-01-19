import assignmentDay3.Student;

class Student{
	String name;
	int roll_no;


	Student(String x, int y){
		name = x;
		roll_no = y;
	}
}

public class Assignment1 {
	

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student S1 = new Student("john",45);
		System.out.println("Name: "+S1.name+"Roll No: "+S1.roll_no);
		

	}
}