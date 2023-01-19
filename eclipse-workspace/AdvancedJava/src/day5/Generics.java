package day5;

public class Generics<Anytype> {
	
	private Anytype at; //variable at //instance variable

	public Generics(Anytype t) {
		at = t ;
		
	}
	   //	void set(Anytype a) {
			
		//	this.at = a;
		//}
		
		Anytype get() {
			return at;
		}
		
		void showtype() {
			System.out.println("Type of data" + at.getClass().getName());
		}
	}

