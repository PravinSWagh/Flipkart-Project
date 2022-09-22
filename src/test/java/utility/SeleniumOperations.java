package utility;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{    
	public static WebDriver driver=null;

	//BrowserLaunch
	public static void BrowserLaunch(Object[] inputParameters)
	{   try{
           
		
		String bname=(String) inputParameters[0];
	    String exe=(String) inputParameters[1];
	
	    if(bname.equalsIgnoreCase("Chrome"))
	    { 
	    	System.setProperty("webdriver.chrome.driver",exe);
	    driver=new ChromeDriver();
	   driver.manage().window().maximize();
	    }
	
	    else if(bname.equalsIgnoreCase("Firefox"))
	    {
	    	System.setProperty("webdriver.gecko.driver",exe);
	    	driver=new FirefoxDriver();
	    	driver.manage().window().maximize();
	    }
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	
} 
	//OpenApplication
	public static  void OpenApplication(Object[] inputParameters)
	{     try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String Applicationopen=(String)inputParameters[0];
		driver.get(Applicationopen);
	       }
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	}
	//Click on Cancel
			public static void click(Object[] inputParameters) 
			{   try{
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String locator=(String) inputParameters[0];
				driver.findElement(By.xpath(locator)).click();
			      }
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
			//Move On Login
			public static void mouseAction(Object[] inputParameters)
			{   try{
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String move=(String) inputParameters[0];
			   Actions act=new Actions(driver);
				WebElement take=driver.findElement(By.xpath(move));
				act.moveToElement(take).build().perform(); 
			      }
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
			//SendKeys
			public static void Sendkeys(Object[] inputParameters)
			{   try{
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String locate=(String) inputParameters[0];
				String value=(String) inputParameters[1];
				driver.findElement(By.xpath(locate)).sendKeys(value);
			      }
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
			
			//Validation
			public static void validation(Object[] inputParameters)
			{   try{
				String xpath=(String)inputParameters[0];
				String givenText=(String)inputParameters[1];
				
				String findedText=driver.findElement(By.xpath(xpath)).getText();
				if(findedText.equalsIgnoreCase(givenText))
				{
					System.out.println("Test Case Pass");
				}
				else
				{
					System.out.println("Test Case Fail");
				}
			}
			catch(StaleElementReferenceException e)
			{
				String xpath=(String)inputParameters[0];
				String givenText=(String)inputParameters[1];
				
				String findedText=driver.findElement(By.xpath(xpath)).getText();
				if(findedText.equalsIgnoreCase(givenText))
				{
					System.out.println("Test Case Pass");
				}
				else
				{
					System.out.println("Test Case Fail");
				}
			}
				
				
			}
	
			
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		//BrowserLaunch
		Object[] input=new Object[5];
		input[0]="Chrome";
		input[1]="D:\\Automation Support\\chromedriver.exe";
		BrowserLaunch(input);
		//OpenApplications
	
		Object[] input1=new Object[1];
		input1[0]="https://www.flipkart.com/";
		OpenApplication(input1);
		//cLick On Cancel
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		click(input2);
		//Move On Login
		Object[] input3=new Object[1];
		input3[0]="//*[text()='Login']";
		mouseAction(input3);
		//Click On My Profile
		Object[] input4=new Object[1];                                       
		input4[0]="//*[text()='My Profile']";
		click(input4);
		Thread.sleep(3000);
		//User Id
		Object[] input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]="9595965069";
		Sendkeys(input5);
		//PassWord
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]="Tara@95";
		Sendkeys(input6);
		//Click On Login Button
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		click(input7);
		//Validation
		Object[] input8=new Object[2];
		input8[0]="//*[text()='Personal Information']";
		input8[1]="Personal Information";
		validation(input8);
		
		
	}	
	

	

}