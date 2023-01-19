package com.mytestngtests2;

import org.testng.annotations.Test;

public class TestNGTestDay23{
	
	@Test(dependsOnMethods= {"testScript_2"})
	public static void testScript_1() {
		System.out.println("I am in TestNgDay23 class and testScript1");
		System.out.println("**************");
	}
	
	@Test
	public static void testScript_2() {
		System.out.println("I am in TestNgDay23 class and testScript2");
		System.out.println("**************");
	}
	
	@Test
	public static void testScript_3() {
		System.out.println("I am in TestNgDay23 class and testScript3");
		System.out.println("**************");
	}
}
	
//	@Test 
//	public static void testScript_4() {
//		System.out.println("I am in TestNgDay21 class and testScript4");
//		System.out.println("**************");
//	}


