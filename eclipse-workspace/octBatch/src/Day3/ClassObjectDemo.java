
//Unparameterized constructor
package Day3;

public class ClassObjectDemo {
	int length;
	int width;
	int height;
	int area;
	int volume;
	
	public void calcArea() {
		area=(2*(length*width + width*height + height*length));
	}
	public void calcVolume() {
		volume = (length*width*height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassObjectDemo b1 = new ClassObjectDemo();
		 
		 b1.length = 10;
		 b1.width =12;
		 b1.height =6;
		 
		 b1.calcArea();
		 b1.calcVolume();
		 System.out.println("Area of b1 is : " + b1.area);
		 System.out.println("Volume of b1 is : " + b1.volume);
		
	}

}
