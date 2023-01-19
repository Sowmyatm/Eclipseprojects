//interface example
package day2;

public interface Vehicle extends Customization {// cannot have body and by default it is abstract and public
	
	void drive(); 
	
	void fuelType();
	
	void start();
	
	void stop();
	
	default void demo() {
		
		System.out.println("Hello Vehicle");
	}
	
	static void demo1()
	{
		System.out.println("HELLO VEHICLE");
	}
}
