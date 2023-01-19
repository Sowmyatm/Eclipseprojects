package com.mytestngday22;
//dataprovider

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationScript4 {
	@Test(dataProvider= "dataCollector")
	public void JavaTestParallelMethod1(int a, int b) throws InterruptedException {
				
		int res=0;
		res=a+b;
		System.out.println(res);
			
	}
	@DataProvider
	public Object[][] dataCollector(){
		Integer[][]data=new Integer[3][2];
		data[0][0]=1;
		data[0][1]=1;
	
		data[1][0]=2;
		data[1][1]=2;
	
		data[2][0]=3;
		data[2][1]=3;
		
		return data; 
		
	}
}
