package com.selBasics;

public class SeleniumTestMain {

	public static void main(String[] args) 
	{
		try
		{
		GmailTest testObj = new GmailTest();
		
		//Launch the browser
		testObj.launchBrowser();
		
		// Login
		testObj.loginGmail();
		
		//Compose mail
		//testObj.composeMail();
		
		//Send mail
		//testObj.sendMail();
		
		//Open the same mail
		//testObj.openMail();
		
		//Delete mails
		testObj.deleteEmail();
		}
		catch(Exception e)
		{
			System.out.println("Exception in main()");
		}
	}

}
