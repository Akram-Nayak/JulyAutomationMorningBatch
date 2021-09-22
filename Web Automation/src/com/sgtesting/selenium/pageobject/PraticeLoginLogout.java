package com.sgtesting.selenium.pageobject;
/*
1) launchBrowser-->navigate-->login as admin-->createuser [User1,User2,User3] -->logout--->
login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout--> 
login as admin[modify the password for User1,User2,User3] --> logout -->login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout 
--> Delete [User1,User2,User3]-->logout -->closeApplication
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeLoginLogout {

	public static WebDriver oBrowser=null;
	public static ActiPagePratice oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		 navigate();
		 login();
		 minimizedFlyOutWindow();
		 //creatUser();
		// loginAsUser();
		 modifyPassword();
		 modifedyUserLogin();
		// logout();
		// closeAplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiPagePratice(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizedFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void creatUser()
	{
		try
		{
			oPage.getUser().click();
			oPage.getAddUser().click();
			oPage.getFirstName().sendKeys("MS");
			oPage.getLastName().sendKeys("Dhoni");
			oPage.getEmail().sendKeys("ms@gmail.com");
			oPage.getUser1().sendKeys("User1");
			oPage.getUser1Password().sendKeys("User1@123");
			oPage.getPasswordCopy().sendKeys("User1@123");
			oPage.getCreatUser().click();
			Thread.sleep(2000);
			
			oPage.getAddUser().click();	
			oPage.getFirstName().sendKeys("Virat");
			oPage.getLastName().sendKeys("Kholi");
			oPage.getEmail().sendKeys("Vk@gmail.com");
			oPage.getUser1().sendKeys("User2");
			oPage.getUser1Password().sendKeys("User2@123");
			oPage.getPasswordCopy().sendKeys("User2@123");
			oPage.getCreatUser().click();
			Thread.sleep(2000);
			
			oPage.getAddUser().click();	
			oPage.getFirstName().sendKeys("Rohit");
			oPage.getLastName().sendKeys("Sharma");
			oPage.getEmail().sendKeys("Rs@gmail.com");
			oPage.getUser1().sendKeys("User3");
			oPage.getUser1Password().sendKeys("User3@123");
			oPage.getPasswordCopy().sendKeys("User3@123");
			oPage.getCreatUser().click();
			Thread.sleep(2000);
			
			logout();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void  loginAsUser()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("User1@123");
			oPage.getLoginButton().click();
			oPage.getWelcomeNote().click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
			
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("User2@123");
			oPage.getLoginButton().click();
			oPage.getWelcomeNote().click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
			
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("User3@123");
			oPage.getLoginButton().click();
			oPage.getWelcomeNote().click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPassword()
	{
		try
		{
			login();
			oPage.getUser().click();  
			oPage.getSelectUser1().click();
			oPage.getModifyNewPassword().sendKeys("User11@123");
			oPage.getModifyRetypPassword().sendKeys("User11@123");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
			
			oPage.getSelectUser2().click();
			oPage.getModifyNewPassword().sendKeys("User22@123");
			oPage.getModifyRetypPassword().sendKeys("User22@123");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
			
			oPage.getSelectUser3().click();
			oPage.getModifyNewPassword().sendKeys("User22@123");
			oPage.getModifyRetypPassword().sendKeys("User22@123");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifedyUserLogin()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("User11@123");
			oPage.getLoginButton().click();
			oPage.getWelcomeNote().click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
			
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("User22@123");
			oPage.getLoginButton().click();
			oPage.getWelcomeNote().click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
			
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("User33@123");
			oPage.getLoginButton().click();
			oPage.getWelcomeNote().click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeAplication()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



