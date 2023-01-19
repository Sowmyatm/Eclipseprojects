package com.mytestngday22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationScripts1 {
	
	
	@Test
	@Parameters({"url","browsername"})
	public void JavaTestParallelMethod1(String url, String browsername) throws InterruptedException {
		
		WebDriver driver = null;
		if(browsername.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
	
		driver.get(url);
		//driver.get(username);
		Thread.sleep(5000);
		driver.close();	
	}
	
	
	@Test
	public void JavaTestParallelMethod2() throws InterruptedException {
		String expected="Google1";
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String actual=driver.getTitle();
		
		Assert.assertEquals(actual, expected);
		
//		if(actual.equalsIgnoreCase(expected))
//		System.out.println("Test case passed");
//		else
//			System.out.println("Test case failed");
		driver.close();
}
}