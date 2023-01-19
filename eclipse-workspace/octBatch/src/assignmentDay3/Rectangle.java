//Area of rectangle

package assignmentDay3;

public class Rectangle {
	
	int length;
	int width;
	int area;
	
	Rectangle(int x, int y){
		length = x;
		width = y;
		
	}
	
	public int find_area(int rec_length, int rec_width) {
		
		area = length * width;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Rectangle R1= new Rectangle (4,5);
		 Rectangle R2 = new Rectangle (5,8);
		 
		 R1.find_area(4,5);
		 R2.find_area(5,8);
		 
		 System.out.println("Area of rectangle R1: " + R1.area );
		 System.out.println("Area or Rectangle R2: " + R2.area);
		 
		 
	}

}
