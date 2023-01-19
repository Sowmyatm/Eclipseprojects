package com.mytestngtests2;

import org.testng.annotations.Test;

public class TestNGDay22 {

	
		@Test(groups= {"smoke","regression"})
		public static void testScript_21() {
			System.out.println("I am in TestNgDay22 class and testScript21");
			System.out.println("**************");
		}
		
		@Test(groups= {"smoke","integration"})
		public static void testScript_22() {
			System.out.println("I am in TestNgDay22 class and testScript22");
			System.out.println("**************");
		}
		
		@Test(groups= {"integration"})
		public static void testScript_23() {
			System.out.println("I am in TestNgDay22 class and testScript23");
			System.out.println("**************");
		}
		
		@Test(groups= {"smoke","regression"})
		public static void testScript_24() {
			System.out.println("I am in TestNgDay22 class and testScript24");
			System.out.println("**************");
		}

	}


