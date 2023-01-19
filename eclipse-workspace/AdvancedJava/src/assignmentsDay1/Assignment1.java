package assignmentsDay1;

class Student{
	private String st_name;
	
		
	 Student(String student_name) {
		
		st_name =student_name;
	}
	Student() {
		
		st_name ="Unkown ";
	}
	public void get_student_name()
	{
		System.out.println(this.st_name);
	}


}
	
	public class Assignment1 {
	
	public static void main(String[] args) {
		Student s1 = new Student();
	
			
		
		Student s2 = new Student("Amogh");
		
		
		s1.get_student_name();
		s2.get_student_name();
		

	}	

}
		
		   
