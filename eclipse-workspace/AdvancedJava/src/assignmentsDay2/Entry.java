package assignmentsDay2;

public class Entry{
	void start(Vehicle  vehicle ) {
		try {
			Car c = (Car)vehicle;
			c.TurningRadius = 4;
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
public static void main(String[] args) {
	
	//Vehicle v= new Vehicle() ; cannot create object for abstract class
	Entry e =new Entry();
	Car car = new Car();
	Bike bike = new Bike();
	
	
	e.start(car);
	e.start(bike);
	System.out.println(car.TurningRadius);
	
			
}
}
