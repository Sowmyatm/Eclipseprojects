package day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		
		Generics<String> s = new Generics<String>("Java");//object s is created of string type
		s.showtype();
		Student s1=new Student("ABCD");
		Generics<Student> s2 = new Generics<Student>(s1);
		s2.showtype();
		Generics<Integer> s4 = new Generics<Integer>(5);
		s4.showtype();
	}

}
