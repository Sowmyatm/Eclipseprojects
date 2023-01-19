package com.mytestngday22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationScripts2 {
	@Test
	public void JavaTestParallelMethod1() throws InterruptedException {
		String expected="Google1";
		SoftAssert assert1=new SoftAssert();
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		String actual=driver.getTitle();
		
		assert1.assertEquals(actual, expected);
		System.out.println("JavaTestParallelMethod1 is executed");
		

		driver.close();
		assert1.assertAll();
}

@Test 
public void JavaTestParallelMethod2() throws InterruptedException {
	
	WebDriver driver;
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	String actual=driver.getTitle();
	
	
	System.out.println("JavaTestParallelMethod2 is executed");
	

	driver.close();
}
}