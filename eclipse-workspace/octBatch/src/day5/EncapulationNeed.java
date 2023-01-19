//pgm without encapsulation

package day5;

class EncapsNeed{
	String EmpName;
	int EmpAge;
	int EmpAadhar;
	
}

public class EncapulationNeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsNeed emp = new EncapsNeed();
		emp.EmpName = "Sowmya";
		emp.EmpAadhar = 1234;
		emp.EmpAge = 35;
		
		System.out.println("Employee Name is : " + emp.EmpName);
		System.out.println("Employee Aadhar is : " + emp.EmpAadhar);
		System.out.println("Employee Age is : " + emp.EmpAge);
		
	}

}
