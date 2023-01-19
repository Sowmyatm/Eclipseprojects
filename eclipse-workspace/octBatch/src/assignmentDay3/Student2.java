package assignmentDay3;

public class Student2 {
	
	int roll_no;
	String name;
	String ph_no;
	String address;
	
 Student2(int stud_num, String stud_name, String stud_ph, String stud_addr){
	
	roll_no=stud_num;
	name = stud_name;
	ph_no=stud_ph;
	address = stud_addr;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2(2,"Sam","8586039969", "San Ramon");
		Student2 s2=new Student2(23,"John", "4084007065", "Sunnyvale");
		
		
		System.out.println("Roll No: " +s1.roll_no + "\nName: " + s1.name +  "\nPhone number: " + s1.ph_no + "\nAddress : " + s1.address );
		System.out.println("\nRoll No: " +s2.roll_no + "\nName: " + s2.name + "\nPhone number: " + s2.ph_no + "\nAddress : " + s2.address );
		
		


	}

}
