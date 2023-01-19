package day5;

abstract class Shape{
	abstract void draw();
	
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Drawing Rectangle");
	}
}
	
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r = new Rectangle();
		r.draw();
		Shape c = new Circle();
		c.draw();

	}

}
