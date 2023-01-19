package com.mytestngtests2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestDay21 {
	
	
	@Test(groups= {"smoke","Regression"})
	public static void testScript_1() {
		System.out.println("I am in TestNgDay21 class and testScript1");
		System.out.println("**************");
	}
	
	@Test(groups= {"smoke"})
	public static void testScript_2() {
		System.out.println("I am in TestNgDay21 class and testScript2");
		System.out.println("**************");
	}
	
	@Test(groups={"regression"})
	public static void testScript_3() {
		System.out.println("I am in TestNgDay21 class and testScript3");
		System.out.println("**************");
	}
	
	@Test(groups= {"smoke","regression"})
	public static void testScript_4() {
		System.out.println("I am in TestNgDay21 class and testScript4");
		System.out.println("**************");
	}

	

}
