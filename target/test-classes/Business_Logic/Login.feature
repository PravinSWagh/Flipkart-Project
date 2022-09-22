Feature: Login functionality

Background: User cancelled initial Login window
Given user provide browser name as a "Chrome" and exe Location as a "D:\\Automation Support\\chromedriver.exe"
Given user enter Url as a "https://www.flipkart.com/"
Given user cancelled initial login window

@Smoketest
Scenario Outline: Login functionality with invalid credentials
When user navigate on login tab
When user click on My Profile
When user enter <username> as username 
When user enter <password> as password 
When user click on login button
Then Application shows error message 

Examples:
     |username|password|
     |9595965069|Tara@95|
     |gvfywvfy|hevfvuef|





