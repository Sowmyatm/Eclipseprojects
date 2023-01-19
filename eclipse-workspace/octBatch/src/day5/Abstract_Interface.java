package day5;

interface Drawable{
	void draw();
	
}

class Rectangle1 implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle1 implements Drawable{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

public class Abstract_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable r = new Rectangle1();
		r.draw();
		
		Drawable c = new Circle1();
		c.draw();
	}

}
