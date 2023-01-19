package day5;
class EncapsTest{
	private String empName;
	private int empAge;
	private int empAadhar;
	
//setter method

	public void setEmpName(String newValue) {
	empName = newValue;
	}
	
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
	
	public void setEmpAadhar(int newValue) {
		empAadhar = newValue;
	}
	
	//getter methods
	
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public int getEmpAadhar() {
		return empAadhar;
	}
}
	

public  class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsTest obj = new EncapsTest();
		
		obj.setEmpName ("Sowmya");
		obj.setEmpAge(36);
		obj.setEmpAadhar(1234);
		
		System.out.println("Employee Name :" + obj.getEmpName());
		System.out.println("Employee Age :" + obj.getEmpAge());
		System.out.println("Employee Aadhar :" + obj.getEmpAadhar());
			
	}
			
		}


