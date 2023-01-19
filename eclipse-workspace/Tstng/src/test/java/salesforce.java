import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.LoginPage;
//import tests.BaseTest;


public class salesforce {
	public static String username = "nov22.sowmyatm@gmail.com" ;
	public static String pwd = "Sowmyatm@123";
	public static WebDriver driver;
	
	
	@BeforeMethod
	 void launchApp() throws InterruptedException{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://login.salesforce.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@AfterMethod
	 void closeapp() {
		driver.quit();	
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pw")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
	}
	
	@Test
	 void TC1() throws InterruptedException {
	 String expectedError="Please enter your password";
//		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
//		driver.findElement(By.name("pw")).clear();
//		driver.findElement(By.id("Login")).click();
	 	login();
	
		String actualError=driver.findElement(By.id("error")).getText();
		if(expectedError.equals(actualError)) {
			System.out.println("TC1 is passed");
		}
		else
			System.out.println("TC1 is failed");
}
	@Test
	public void TC2() throws InterruptedException {
	
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("Sowmyatm@123");
		driver.findElement(By.id("Login")).click();
	//Thread.sleep(3000);
		String expectedpg ="Welcome to your free trial";
		String actualpg = "Home page";
	
		if(expectedpg.equals(actualpg)) {
			System.out.println("TC2 Passed");
		}
		else
			System.out.println("TC2 failed");
			
	}


	@Test
	//need to fix
	public void TC3() throws InterruptedException  {
	
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@123");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='rememberUn']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("userNavLabel")).click();
		//Thread.sleep(3000);
	
		driver.findElement(By.xpath("//*[@title='Logout']")).click();
		String Expectedtxt="nov22.sowmyatm@gmail.com";
		String Actualtxt = driver.findElement(By.id("username")).getText();
		//Thread.sleep(3000);
	
		if (Expectedtxt.equals(Actualtxt)){
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
	

	@Test
	 void TC4a() throws InterruptedException {
		login();
//		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.name("pw")).clear();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name=\'Login' and @type=\'submit\']")).click();
		driver.findElement(By.id("forgot_password_link")).click();
		driver.findElement(By.xpath("//*[@id='un\']")).sendKeys("nov22.sowmyatm@gmail.com");
		driver.findElement(By.name("continue")).click();
		Thread.sleep(3000);
		boolean result1=driver.findElement(By.xpath("//div[@id='content']//p[1]")).getText()
			.contains("We've sent you an email with a link to finsh resetting your password");
		System.out.println(result1);
	
		Thread.sleep(3000);
	
		if(result1){
			System.out.println("TC4a is passed");
		}
		else
			System.out.println("TC4a failed");
	}
	
	@Test
	 void TC4b() throws InterruptedException {
	
	
		String expectedError="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.name("pw")).sendKeys("22131");
		Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
		String actualError=driver.findElement(By.id("error")).getText();
		if(expectedError.equals(actualError)) {
			System.out.println("TC4b is passed");
		}
			else
				System.out.println("TC4b is failed");
		
	}


	@Test
	void TC5() throws InterruptedException {
	
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("Sowmyatm@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userNavLabel")).click();
		List<WebElement> listoptions=driver.findElements(By.id("userNav"));
		for(WebElement e:listoptions) {
			System.out.println(e.getText());
		}
	}
	
	@Test
	 void TC6() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("Sowmyatm@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='userNav']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='My Profile']")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='My Settings']")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Logout']")).isDisplayed();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//*[@alt='Edit Profile']")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//a[@aria-selected='false'][2]")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.name("lastName")).clear();
		Thread.sleep(3000);
	
		driver.findElement(By.name("lastName")).sendKeys("Marigowda");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		Thread.sleep(3000);
	
		
		driver.findElement(By.xpath("//span[@class='publisherattachtext ']")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//html[@dir='ltr']")).sendKeys("Hello World!");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[@title='File']")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[@title='Upload a file from your computer']")).click();
		Thread.sleep(3000);
	
		WebElement Pphoto =driver.findElement(By.xpath("//img[@alt='Sowmya Marigowda']"));
		Actions action = new Actions(driver);
		action.moveToElement(Pphoto).build().perform();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[@id=uploadLink]")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@class='fileInput']")).click();
		Thread.sleep(3000);
	
	}


//	@Test
//	static void TC7() throws InterruptedException{
//
//		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
//		driver.findElement(By.name("pw")).sendKeys("Sowmyatm@123");
//		driver.findElement(By.id("Login")).click();
//
//
//		driver.findElement(By.id("userNavLabel")).click();
//
//		driver.findElement(By.xpath("//a[@title='My Settings']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.id("PersonalInfo_font")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.id("LoginHistory_font")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.id("DisplayAndLayout_font")).click();
//		driver.findElement(By.id("CustomizeTabs_font")).click();
//		driver.findElement(By.id("p4")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//option[@value='02uDn000001Rm7C']")).click();
//		boolean bool=driver.findElement(By.xpath("//label[@for='duel_select_0']")).isDisplayed();
//		Select sel = new Select(driver.findElement(by.));
//
//}
//	
	@Test
	 void TC8() throws InterruptedException{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pw")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='menuButton menuButtonRounded']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")).click();
	//	driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")).clear();
		
	}
	@Test
	void TC9() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pw")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='menuButton menuButtonRounded']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	//need to fix	
	void TC10() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pw")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title=\'Accounts Tab\']")).click();
		Thread.sleep(4000);
	
		String expected="Accounts: Home ~ Salesforce - Developer Edition";
		WebDriver driver;
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://ddn000002noixmau-dev-ed.develop.my.salesforce.com/001/o");
		Thread.sleep(5000);
		String actual="return document.title";
		Assert.assertEquals(actual, expected);
		driver.close();
	
}

	
	@Test
	 void TC11() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pw")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title=\'Accounts Tab\']")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//a[@href='/ui/list/FilterEditPage?ftype=a&retURL=%2F001&cancelURL=%2F001%2Fo']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Sowmya_12");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@value='New_This_Week']")).clear();
		driver.findElement(By.xpath("//input[@maxlength='80']")).sendKeys("");
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(4000);
		
	}
	
	@Test
	void TC12() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("Sowmyatm@123");
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@href='/ui/list/FilterEditPage?id=00BDn00000AVirl&retURL=%2F001&cancelURL=%2F001%2Fo']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("fname")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.id("fname")).sendKeys("tms");
	    Thread.sleep(3000);
	    
	    	//driver.findElement(By.xpath("//select[@class='column'][1])")).;
		  
		   
		   
		   Select s1 =new Select(driver.findElement(By.className("column")));
		   
		   s1.selectByVisibleText("Account Name");
		   //s1.deselectAll();
		   Thread.sleep(5000);
		  //s1.deselectByVisibleText("Account Name");
		   
		   Select s =new Select(driver.findElement(By.id("fop1")));
		   s.selectByVisibleText("contains");
		   Thread.sleep(3000);
		   //s.deselectByVisibleText("contains");
		   
//		   driver.findElement(By.id("fval1")).clear();
		 driver.findElement(By.id("fval1")).sendKeys("a");
		 Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,700);");
		 
		 Select s3 =new Select(driver.findElement(By.id("colselector_select_0")));
		 s3.selectByVisibleText("Last Activity");
		 Thread.sleep(3000);
		 driver.findElement(By.className("rightArrowIcon")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("save")).click();
		 
		 
		 Thread.sleep(3000);
		 //s3.deselectAll();
		 
		   
		   
	   }
		 
	//need to complete
	@Test
	void TC13() throws InterruptedException {
		
		login();
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@href='/merge/accmergewizard.jsp?retURL=%2F001%2Fo']")).click();
	    driver.findElement(By.id("srch")).sendKeys("tms");
	    driver.findElement(By.className("btn")).click(); 
	    Thread.sleep(8000);
	    
	}
	
	//not working
	@Test
	void TC14() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@href='/00O?rt=1&retURL=%2F001%2Fo&edit=yes&scope=user&sort=DUE_DATE&t=title2&colDt_c=DUE_DATE&colDt_e=11%2F26%2F2022&c=DD&c=AO&c=AN&c=A1SA&c=TY&c=RT&c=UD&details=yes']")).click();
	   Thread.sleep(3000);

	   driver.findElement(By.xpath("//input[@id='ext-gen20']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"ext-gen265\"]/div[1]/b")).click();
	    Thread.sleep(3000);
	    
	    Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id=\'ext-gen265\']/div[3]"))).build().perform();
	   
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\'ext-gen265\']/div[3]")).click();
	   Thread.sleep(3000);
	   
	   
//	   driver.findElement(By.name("startDate")).click();
//	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//label[@id='ext-comp-1056']")).click();
	   
	   WebElement dropdown=driver.findElement(By.xpath("//img[@id='ext-gen152']"));
	   dropdown.click();
	   WebElement monthyear=driver.findElement(By.xpath("//button[@type=button])[18]"));
	   String s = monthyear.getText();
	   System.out.println(s);
	   String month=s.split(" ")[0].trim();
	   String year =s.split(" ")[1].trim();
	   
	   String expectedmonth="December";
	   String expectedyear="2022";
	   while(!month.equals(expectedmonth) && (year.equals(expectedyear))) {
		   driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
		   driver.findElement(By.xpath("//img[@id='ext-gen152']")).getText();
		   break;
	   }
	   
	   driver.findElement(By.xpath("//table[@class='x-date-inner']//td[contains(@class,'x-date-active')])[11]")).click();
	   
	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//*[@class='x-date-active x-date-today x-date-selected']")).click();
//	   Thread.sleep(3000);
//
//	  
//	  
//	   
//	   driver.findElement(By.name("endDate")).click();
//	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//label[@id='ext-comp-1057']")).click();
//	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//img[@id='ext-gen154']")).click();
//	   Thread.sleep(3000);
//	   
//	   driver.findElement(By.xpath("//button[@id='ext-gen316']")).click();
//	   Thread.sleep(3000);
	   
//	   Actions action1=new Actions(driver);
//	    action1.moveToElement(driver.findElement(By.xpath("//a[@title='Next Month (Control+Right)']"))).build().perform();
	//   driver.findElement(By.xpath("//a[@title='Next Month (Control+Right)']")).click();
//	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//button[@id='ext-gen313']")).click();
//	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//*[@id=\"ext-gen308\"]/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/a/em/span")).click();
//	   Thread.sleep(3000);
	   


	    
	   
		  
  
	}

	//not working
	@Test
	 void TC15() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@title='Opportunities Tab']")).click();
		Thread.sleep(3000);
		
		//To vrerify dropdown is visible
	    WebElement dropdown = driver.findElement(By.xpath("//select[@title='View:']")); 
	    Thread.sleep(3000);
	    if(dropdown.isEnabled() && dropdown.isDisplayed()) {
	    	 System.out.println("Dropdown is enabled and visible"); 
	    } 
	   else { 
	       System.out.println("Dropdown is not visible"); 
	    }
	    
	    //to get the size of dropdownlist
	    Select select = new Select(dropdown); 
	    int listSize = select.getOptions().size(); 
	    System.out.println("List size: " +listSize); 
	
	}
	
	//not working
	@Test
	void TC16() throws InterruptedException {
		
		login();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Opportunities Tab']")).click();
		Thread.sleep(3000);
		
	    WebElement Opportunities = driver.findElement(By.xpath("//input[@value=' New ']")); 
		Thread.sleep(3000);
		

		if(Opportunities.isDisplayed()) {
			System.out.println("Edit page is displayed");
		}else
			System.out.println("Edit Page is not displayed");
			
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("opp3")).sendKeys("xyz");
		Thread.sleep(3000);
		driver.findElement(By.id("opp4")).sendKeys("Manu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='opp9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"calRow5\"]//td[4]")).click();
		Thread.sleep(3000);
		Select s =new Select(driver.findElement(By.xpath("//select[@id='opp11']")));
		s.selectByVisibleText("Qualification");
		
//		Actions action=new Actions(driver);
//	    action.moveToElement(driver.findElement(By.xpath("//select[@id='opp11']//option[@value='Qualification']")));
//		driver.findElement(By.xpath("//select[@id='opp11']//option[@value='Qualification']")).click();
		driver.findElement(By.id("opp12")).clear();
		driver.findElement(By.id("opp12")).sendKeys("20");
		Thread.sleep(3000);
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='opp6']")));
		s1.selectByVisibleText("Phone Inquiry");
		Thread.sleep(3000);
		
		driver.findElement(By.id("opp17")).sendKeys("computer");
		//driver.findElement(By.xpath("//img[@alt='Primary Campaign Source Lookup (New Window)']")).click();
		
		Thread.sleep(3000);
//		driver.switchTo().frame(driver.findElement(By.xpath("//img[@alt='Primary Campaign Source Lookup (New Window)']")));
//		Thread.sleep(3000);

//		driver.findElement(By.xpath("//input[@maxlength='80']")).
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
//		
		
		
		
		
	}
	
	

	
	@Test
 void TC17() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("Sowmyatm@123");
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Opportunities Tab']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/00O?rt=22&retURL=%2F006%2Fo&open=open&break0=STAGE_NAME&t=title5&c=RD&c=FN&c=AN&c=ON&c=SN&c=FQ&c=PB&c=AG&c=CD&c=CR&c=NS&c=LS&c=TY&s=AM&s=EA&a=AG&details=yes&format=t']")).click();
		Thread.sleep(5000);
		System.out.println("TC17 passed");
	}
	
	
	@Test
	 void TC18() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("Sowmyatm@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Opportunities Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/00O?rt=22&retURL=%2F006%2Fo&open=open&break0=STAGE_NAME&sort=STAGE_DURATION&sortdir=down&t=title7&c=FN&c=AN&c=ON&c=SN&c=FQ&c=PB&c=CD&c=TY&s=AM&a=AG&a=SD&details=yes&format=t']")).click();
		
	}
	
	@Test
	void TC19() throws InterruptedException {
		
		login();
		
		driver.findElement(By.xpath("//a[@title='Opportunities Tab']")).click();
		Thread.sleep(3000);
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='quarter_q']")));
		select.selectByVisibleText("Current and Next FQ");
		Thread.sleep(3000);

		
		Select select1=new Select(driver.findElement(By.xpath("//select[@id='open']")));
		select1.selectByVisibleText("Open Opportunities");
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(3000);
		
		WebElement opppage = driver.findElement(By.xpath("//*[@class='noSecondHeader pageType']"));
		if(opppage.isDisplayed()) {
			System.out.println("Opportunity Report Page is displayed");
			
		}else
			System.out.println("Opportunity Report Page is not displayed");

		
	}
	
	@Test
	void TC20() throws InterruptedException {
		login();
		
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(3000);
		
		WebElement leadPage = driver.findElement(By.xpath("//img[@class='pageTitleIcon']"));
		if(leadPage.isDisplayed()) {
			System.out.println("Leads Home page is displayed");
		}else
			System.out.println("Leads Home page is not displayed ");
	}
	
	
	@Test
	void TC21() throws InterruptedException {
		
		login();

		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(3000);
		
	      //Select class to get options in dropdown
	      Select l = new Select(driver.findElement(By.tagName("select")));
	
	      List<WebElement> m = l.getOptions();
	      System.out.println("Drodown list items are: ");
	      //iterate through options till list size
	      for (int j = 0; j < m.size(); j++) {
	         String s = m.get(j).getText();
	         System.out.println(s);
	      }
		
	      driver.findElement(By.tagName("select")).click();
	      
	      Thread.sleep(3000);

	}
	
	
	@Test	
	void TC22() throws InterruptedException {
		
		login();
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(3000);
		
		Select s = new Select(driver.findElement(By.tagName("select")));
		Thread.sleep(3000);
		driver.findElement(By.tagName("select")).click();
		Thread.sleep(3000);

//		Select s = new Select(driver.findElement(By.xpath("//*[@id=\'00BDn000007Te7g_listSelect\']")));
//		Thread.sleep(3000);
		s.selectByVisibleText("Today's Leads");
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='userNav']")).click();
		Thread.sleep(3000);

		//mousehover
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Logout']")));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		Thread.sleep(3000);

		login();
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
		
		String s1= "Leads ~ Salesforce - Developer Edition";
		if(s1.equals(driver.getTitle())) {
			System.out.println("Today's Lead page is displayed");
		}else
			System.out.println("Today's Lead page is not displayed");
		
	}	
	
	@Test
	void TC23() throws InterruptedException {
		login();

		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(3000);
		
		Select s1 = new Select(driver.findElement(By.tagName("select")));
		Thread.sleep(3000);
		driver.findElement(By.tagName("select")).click();
		Thread.sleep(3000);

		s1.selectByVisibleText("Today's Leads");
		Thread.sleep(3000);
		
	}
			
		
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void TC24() throws InterruptedException {
		
		login();
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("new")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("name_lastlea2")).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.findElement(By.id("lea3")).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.findElement(By.name("save")).click();
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//h2[@class='topName']"));
		if(e.getText().equals("ABCD"))
		{
			System.out.println("New lead page is displayed");
		}else
			System.out.println("New lead page is not displayed");
   
		}
	
	
	@Test
	void TC25() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("new")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name_lastcon2")).sendKeys("Gowda");
		Thread.sleep(3000);
		driver.findElement(By.name("con4")).sendKeys("sowmya");
		Thread.sleep(3000);
		driver.findElement(By.name("save")).click();
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//h2[@class='topName']"));
		if(e.getText().equals("Gowda"))
		{
			System.out.println("New contact is displayed");
		}else
			System.out.println("New contact is not displayed");
   
	}
	
	@Test
	void TC26() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create New View")).click();
		Thread.sleep(3000);
		
		int length=10;
		Boolean useLetters=true;
		Boolean useNumbers=true;
		String generatedString= RandomStringUtils.random(length, useLetters, useNumbers);
		driver.findElement(By.id("fname")).sendKeys(generatedString);
		Thread.sleep(3000);
		
		driver.findElement(By.id("devname")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("devname")).sendKeys(generatedString);
		Thread.sleep(3000);
		driver.findElement(By.name("save")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		String s1="Salesforce - Developer Edition";
		if(s1.equals(driver.getTitle())) {
		System.out.println("Saved Contacts page is displayed ");
		}else
			System.out.println("Saved Contacts page is not displayed");
	
	}	
	
	@Test
	void TC27() throws InterruptedException {
	
	login();
	driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//select[@id='hotlist_mode']")).click();
	Thread.sleep(3000);
	 Select l = new Select(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
		
     List<WebElement> m = l.getOptions();
     System.out.println("Drodown list items are: ");
     //iterate through options till list size
     for (int j = 0; j < m.size(); j++) {
        String s = m.get(j).getText();
        System.out.println(s);
     }
}
	
	@Test
	void TC28() throws InterruptedException {
		
		login();
		
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(3000);
		
		 Select l = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		 l.selectByVisibleText("My Contacts");
		 Thread.sleep(3000);
		
		 System.out.println(driver.getTitle());
		 String s1="Contacts: Home ~ Salesforce - Developer Edition";
		 
		 if(s1.equals(driver.getTitle())){
			System.out.println("Contacts view is displayed");
			
		 }else
			 System.out.println("Contacts view is not displayed");
		 
		
	}
	
	@Test
	void TC29() throws InterruptedException {
		
		login();
		
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Gowda")).click();
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//h2[@class='topName']"));
		if(e.getText().equals("Gowda"))
		{
			System.out.println("New contact is displayed");
		}else
			System.out.println("New contact is not displayed");
   
		
	}
	
	@Test
	void TC30() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create New View")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("devname")).sendKeys("EFGH");
		Thread.sleep(3000);
		
		driver.findElement(By.name("save")).click();
		Thread.sleep(3000);
		
		String s1="Error: You must enter a value";
		WebElement e = driver.findElement(By.xpath("//div[@class='errorMsg']"));
		if(e.getText().equals(s1)) {
			System.out.println("TC30 is passed");
			
		}else
			System.out.println("TC30  failed");
		
		
	}
	
	
	@Test
	void TC31() throws InterruptedException {
		login();
		
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create New View")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("fname")).sendKeys("ABCD");
		Thread.sleep(3000);
		
		driver.findElement(By.name("devname")).clear();
		Thread.sleep(5000);
		
		driver.findElement(By.id("devname")).sendKeys("EFGH");
		Thread.sleep(3000);
		
		driver.findElement(By.name("cancel")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		String s1="Contacts: Home ~ Salesforce - Developer Edition";
		if(s1.equals(driver.getTitle())) {
			System.out.println("TC31 passed");
		}else
			System.out.println("TC31 failed");
		
	}
	
	
	@Test
	void TC32() throws InterruptedException{
		login();
		
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("new")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
		Thread.sleep(3000);
		
		driver.findElement(By.id("con4")).sendKeys("Global Media");
		Thread.sleep(3000);
		
		driver.findElement(By.name("save_new")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		String s1="Contact Edit: New Contact ~ Salesforce - Developer Edition";
	}
	
	@Test
	void TC33() throws InterruptedException {
		
		login();
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		
//		WebElement e = driver.findElement(By.xpath("(//a[@href='/_ui/core/userprofile/UserProfilePage'])[1]"));
//		if(e.isDisplayed()) {
//			System.out.println("fname, lname of account holder is displayed");
//		}
		
		driver.findElement(By.linkText("Sowmya Abcd")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		String s1="User: Sowmya Abcd ~ Salesforce - Developer Edition";
		String s2=driver.getTitle();
		if(s1.equals(s2)) {
			System.out.println("TC33 passed");
		}else
			System.out.println("TC33 failed");
		
	}
	
	
	@Test
	void TC34() throws InterruptedException {
		
		login();
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@href='/_ui/core/userprofile/UserProfilePage'])[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='Edit Profile'][1]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("lastName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Abcd");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.linkText("Sowmya Abcd"));
		if(e.isDisplayed()) {
		System.out.println("TC34 Passed");
		}else
			System.out.println("TC34 failed");
	}
	
	
	@Test
	void TC35() throws InterruptedException {
		
		login();
		driver.findElement(By.className("allTabsArrow")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("btnImportant")).click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		
		List<WebElement> listoptions=driver.findElements(By.xpath("//select[@id='duel_select_1']"));
		for(WebElement e:listoptions) {
			System.out.println(e.getText());
		}
//		driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]/option[7]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]/option[@value='Opportunity']")).click();
		Thread.sleep(3000);
		
//		Select s = new Select(driver.findElement(By.xpath("//select[@id='duel_select_1']")));
//		s.selectByVisibleText("Libraries");
		
		driver.findElement(By.className("leftArrowIcon")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//ul[@id='tabBar']"))
		List<WebElement> listoptions1=driver.findElements(By.xpath("//ul[@id='tabBar']"));
		for(WebElement e:listoptions1) {
			System.out.println(e.getText());
			
		}
		
	}


}











//public static void main(String[] args) throws Exception {
//	SFDC1_Test.launchApp();
//	
//	login();
//	
//	SFDC1_Test.TC3();
////	SFDC1.TC3();
////	SFDC1.TC4a();
////	SFDC1.TC4b();
////	SFDC1.TC17();
////	SFDC1.TC18();
////	SFDC1.TC5();
//SFDC1_Test.TC2();
////	SFDC1.TC6();
////	SFDC1.TC7();
////	SFDC1.TC11();
////	SFDC1_Test.TC10();
////	closeapp();
//}
////
//}