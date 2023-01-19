
//Parameterized Constructor example
package Day3;

class Box{
	int length;
	int width;
	int height;
	int area;
	int volume;
	
	
	Box(int x, int y, int z){
		length = x;
		width = y;
		height = z;
		
	}
	
	public void calcArea() {
		area = (2*(length*width + width*height + height*length));
		
	}
	
	public void calcVolume() {
		volume = (length*width*height);
	}
}

	public class ClassObjectDemo2 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box(5, 10, 20);
		
		b1.calcArea();
		b1.calcVolume();
		
		System.out.println("Area of b1 : " + b1.area);
		System.out.println("Volume of b1 : " + b1.volume);
		
		Box b2 = new Box(50, 10, 28);
		
		b2.calcArea();
		b2.calcVolume();
		
		System.out.println("\n \nArea of b2 : " + b2.area);
		System.out.println("Volume of b2 : " + b2.volume);
		
		
		

}
	
}
