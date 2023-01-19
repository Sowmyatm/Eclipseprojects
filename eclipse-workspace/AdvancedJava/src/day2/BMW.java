package day2;

public class BMW implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Automatic drive");
		
	}

	@Override
	public void fuelType() {
		System.out.println("Diesel");
	}

	@Override
	public void start() {
		System.out.println("remote start");
		
	}

	@Override
	public void stop() {
		System.out.println("hydraulic braking");
		
	}
	
	public void demo() {
		System.out.println("Hello BMW");
	}

	public static void main(String[] args) {
		BMW x1 = new BMW();
		x1.drive();
		x1.fuelType();
		x1.start();
		x1.stop();
		x1.tyres();
		x1.AV();
		x1.navigation();
		Vehicle.demo1();
	}

	@Override
	public void tyres() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AV() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigation() {
		// TODO Auto-generated method stub
		
	}

	
}
