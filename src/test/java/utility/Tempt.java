package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{
	public static void main(String[] args) throws InterruptedException 
	{     //BrowserLaunch
		System.setProperty("webdriver.chrome.driver","D:\\Automation Support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		//ApplicationOpen
		driver.get("https://www.flipkart.com/");
		//click On Cancel
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		//On Login
		Actions move=new Actions(driver);
		WebElement take=driver.findElementByXPath("//*[text()='Login']");
		move.moveToElement(take).build().perform();
		//Click On My Profile
		//driver.findElementByXPath("//*[text()='My Profile']").click();
		WebElement take1=driver.findElementByXPath("//*[text()='My Profile']");
		Thread.sleep(2000);
		move.moveToElement(take1).build().perform();
		Thread.sleep(2000);
		take1.click();
		//Login Credentials
		Thread.sleep(3000);
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9595965069");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Tara@95");
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		//Click On Manage Address
		Thread.sleep(3000);
		driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		//Click On Add New Address
		Thread.sleep(3000);
		driver.findElementByXPath("//*[text()='ADD A NEW ADDRESS']").click();
		//Manage Address
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[1]").sendKeys("Pravin S Wagh");
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[2]").sendKeys("8080587586");
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[3]").sendKeys("414003");
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[4]").sendKeys("Savedi");
		driver.findElementByXPath("(//*[@class='_1sQQBU _1w3ZZo _1TO48q'])").sendKeys("Ghar No.27,Panchavati Colony,Pipeline Road,Savedi,Ahemadnagar");
	    driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[6]").sendKeys("Ram Mandir");	
        driver.findElementByXPath("//*[text()='Work']").click();
        driver.findElementByXPath("//*[text()='Save']").click();
        
        Thread.sleep(5000);
        
        driver.close();
	}
	
}
