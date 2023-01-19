package assignmentDay3;

public class Student {
	int roll_no;
	String name;
Student(int num, String stud_name)
{
	roll_no=num;
	name=stud_name;
	}
	public static void main(String[] args) {
	
		Student s1=new Student(2,"John");
		
		System.out.println("Name: "+s1.name + "\nRoll No: "+s1.roll_no);
				
				

	}

}
