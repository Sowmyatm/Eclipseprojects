package day2;

public class Samsung extends Phone {

	@Override
	void makecall() {
		System.out.println("Calling...");
		
	}
		public static void main(String[] args) {
			Samsung s = new Samsung();
			s.makecall();
			s.sendsms();

	}

}
