package assignmentsDay2;

public class Airplane {

	public static void main(String[] args) {
		Flight f1 = new Boeing(); //object created for boeing and airbus to implement methods interface class flight
		Flight f2 = new Airbus();
		f1.takedown();
		f1.takeoff();
		f2.takedown();
		f2.takeoff();
	}

}
