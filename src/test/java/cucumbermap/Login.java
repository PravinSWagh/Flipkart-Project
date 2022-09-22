package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login
{    //BrowserLaunch
	@Given ("^user provide browser name as a \"(.*)\" and exe Location as a \"(.*)\"$")
	public void browserLaunch(String name,String exe)
	{
		Object[] input=new Object[5];
		input[0]=name;
		input[1]=exe;
		SeleniumOperations.BrowserLaunch(input);
	}
	//OpenApplication
	@Given ("^user enter Url as a \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.OpenApplication(input1);
	}
	//Click On Cancel
	@Given ("^user cancelled initial login window$")
	public void cancel()
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.click(input2);
	}
	//Move On Login
	@When ("^user navigate on login tab$")
	public void navigateLogin()
	{
		Object[] input3=new Object[1];
		input3[0]="//*[text()='Login']";
		SeleniumOperations.mouseAction(input3);
	}
	//Click On My Profile
	@When ("^user click on My Profile$")
	public void myProfile() throws InterruptedException
	{
		Object[] input4=new Object[1];                                       
		input4[0]="//*[text()='My Profile']";
		SeleniumOperations.click(input4);
		Thread.sleep(3000);
	}
	//UserName
	@When ("^user enter (.+) as username$")
	public void userName(String value)
	{
		Object[] input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]=value;
		SeleniumOperations.Sendkeys(input5);
	}
	//PassWord
	@When ("^user enter (.+) as password$")
	
	public void password(String pass)
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]=pass;
		SeleniumOperations.Sendkeys(input6);
	}
	//Click On Login Button
	@When ("^user click on login button$")
	public void clickOnLogin()
	{Object[] input7=new Object[1];
	input7[0]="(//*[@type='submit'])[2]";
	SeleniumOperations.click(input7);
		
	}
	//Validation
	@Then ("^Application shows user profile to user$")
	public void validation()
	{
		Object[] input8=new Object[2];
		input8[0]="//*[text()='Personal Information']";
		input8[1]="Personal Information";
		SeleniumOperations.validation(input8);
	}
	

	

}
