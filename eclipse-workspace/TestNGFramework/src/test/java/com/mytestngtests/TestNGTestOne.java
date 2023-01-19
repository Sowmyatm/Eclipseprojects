package com.mytestngtests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestOne extends BaseTestNGTest {
	
	
	
	
	@BeforeMethod
	public static void setUp_1() {
		System.out.println("Inside beforeMethod and TestNGOne class setUp_1");
		System.out.println("**************");
	}
	
	@AfterMethod
	public static void tearDown_1() {
		System.out.println("Inside afterMethod and TestNGOne class tearDown_1");
		System.out.println("**************");
	}
	
	@BeforeClass
	public static void setUp_2() {
			System.out.println("Inside beforeClass and TestNGOne class setUp_2");
			System.out.println("**************");
		}
		
	@AfterClass
	public static void tearDown_2() {
		System.out.println("Inside afterClass and TestNGOne class tearDown_2");
		System.out.println("**************");
	}
		
	
	@Test(priority=3)
	public static void testScript_1() {
		System.out.println("I am in TestNgOne class and testScript1");
		System.out.println("**************");
	}
	
	@Test(priority=-1)
	public static void testScript_2() {
		System.out.println("I am in TestNgOne class and testScript2");
		System.out.println("**************");
	}
	
	@Test(priority=0)
	public static void testScript_3() {
		System.out.println("I am in TestNgOne class and testScript3");
		System.out.println("**************");
	}
	
	@Test(priority=2)
	public static void testScript_4() {
		System.out.println("I am in TestNgOne class and testScript4");
		System.out.println("**************");
	}

	

}
