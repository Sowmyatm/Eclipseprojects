package com.mytestngtests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestNGTest {

	@BeforeTest
	public static void setUp_12() {
		System.out.println("Inside beforeTest and BaseTestNGTest class setUp_12");
		System.out.println("**************");
	}
	
	@AfterTest
	public static void tearDown_12() {
		System.out.println("Inside afterTest and BaseTestNGTest class tearDown_12");
		System.out.println("**************");
	}
	
	@BeforeSuite
	public static void setUp_123() {
		System.out.println("Inside beforeSuite and BaseTestNGTest class tearDown_123");
		System.out.println("**************");
	}
	
	@AfterSuite
	public static void tearDown_123() {
		System.out.println("Inside afterSuite and BaseTestNGTest class tearDown_123");
		System.out.println("**************");
	}


}