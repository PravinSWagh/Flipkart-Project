package utility;

public class Calling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		//BrowserLaunch
		Object[] input=new Object[5];
		input[0]="Chrome";
		input[1]="D:\\Automation Support\\chromedriver.exe";
		SeleniumOperations.BrowserLaunch(input);
		//OpenApplications
	
		Object[] input1=new Object[1];
		input1[0]="https://www.flipkart.com/";
		SeleniumOperations.OpenApplication(input1);
		//cLick On Cancel
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.click(input2);
		//Move On Login
		Object[] input3=new Object[1];
		input3[0]="//*[text()='Login']";
		SeleniumOperations.mouseAction(input3);
		//Click On My Profile
		Object[] input4=new Object[1];                                       
		input4[0]="//*[text()='My Profile']";
		SeleniumOperations.click(input4);
		Thread.sleep(3000);
		//User Id
		Object[] input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]="9595965069";
		SeleniumOperations.Sendkeys(input5);
		//PassWord
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]="Tara@95";
		SeleniumOperations.Sendkeys(input6);
		//Click On Login Button
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		SeleniumOperations.click(input7);
		//Validation
		Object[] input8=new Object[2];
		input8[0]="//*[text()='Personal Information']";
		input8[1]="Personal Information";
		SeleniumOperations.validation(input8);
		
		
	}

	
}
