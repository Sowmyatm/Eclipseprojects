package day5;

class Teacher
{
	private String Designation;
	private String university;
	
	protected void setDesignation(String _Designation) {
		Designation = _Designation;
	}
	
	protected void setuniversity(String _university) {
		university = _university;
	}
	
	protected String getDesignation() {
		return Designation;
	}
	
	protected String getuniversity() {
		return university;
	}
	
	void does() {
		System.out.println("Teaching");
		System.out.println("Evaluation");
	}
	
}
class ProgrammingTeacher extends Teacher
{
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		ProgrammingTeacher obj = new ProgrammingTeacher();
		obj.setDesignation("HOD");
		obj.setuniversity("BITS");
		
		System.out.println(obj.getDesignation());
		System.out.println(obj.getuniversity());
		 
		obj.does();

	}

}
