//to print area and perimeter of a triangle

package assignmentDay3;
import java.lang.Math;

public class Triangle {
	
	int side1=3;
	int side2=4;
	int side3=5;
	void set_sides(int a,int b,int c)
	{
		this.side1=a;
		this.side2=b;
		this.side3=c;
		
	}
	double find_area()
	{
		double area;
		double s=(this.side1+this.side2+this.side3)/2;
		area=Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3) );
		return area;
	}
	int find_perimeter()
	{
		int perimeter=this.side1+this.side2+this.side3;
		return(perimeter);
		
	}
	
	public static void main(String[] args) {
		
		Triangle t1= new Triangle();
		//t1.set_sides(3,4,5);
		System.out.printf("Area=%f\n",t1.find_area());
		System.out.printf("Perimeter=%d",t1.find_perimeter());
	}

}
