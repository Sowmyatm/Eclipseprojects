package com.mytestngtests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestTwo extends BaseTestNGTest{
	
	
	
	@BeforeMethod
	public static void setUp_1() {
		System.out.println("Inside beforeMethod and TestNGTwo class setUp_1");
		System.out.println("**************");
	}
	
	@AfterMethod
	public static void tearDown_1() {
		System.out.println("Inside afterMethod and TestNGTwo class tearDown_1");
		System.out.println("**************");
	}
	
	@BeforeClass
	public static void setUp_2() {
			System.out.println("Inside beforeClass and TestNGTwo class setUp_2");
			System.out.println("**************");
		}
		
	@AfterClass
	public static void tearDown_2() {
		System.out.println("Inside afterClass and TestNGTwo class tearDown_2");
		System.out.println("**************");
	}
		@Test
		public static void testScript_1() {
			System.out.println("I am in TestNgTwo class and testScript1");
			System.out.println("**************");
		}
		
		@Test
		public static void testScript_4() {
			System.out.println("I am in TestNgTwo class and testScript4");
			System.out.println("**************");
		}
		
		@Test
		public static void testScript_2() {
			System.out.println("I am in TestNgTwo class and testScript2");
			System.out.println("**************");
		}
		
		@Test
		public static void testScript_3() {
			System.out.println("I am in TestNgTwo class and testScript3");
			System.out.println("**************");
		}

		

	}

	


