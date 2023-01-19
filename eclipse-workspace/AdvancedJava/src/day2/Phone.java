//Abstract class example
package day2;


public abstract class Phone {
	
	abstract void makecall(); //can have method but not body
	void sendsms(){  //non abstract method has body
		System.out.println("Sending SMS");
	}

}
