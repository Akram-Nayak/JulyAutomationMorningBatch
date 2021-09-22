package com.sgtesting.selenium.introduction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1) launchBrowser-->navigate-->login as admin-->createuser [User1,User2,User3] -->logout--->
//login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout--> 
//login as admin[modify the password for User1,User2,User3] --> logout -->login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout 
//--> Delete [User1,User2,User3]-->logout -->closeApplication

public class AssignementAdvance {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		luanchBrowser();
		navigate();
		//loginAsAdmin();
		//createUser();
		//logout();
		//loginAsUser();
		//modifyPassword();
		//loginAsUserAgain();
		delectUser();
		//closeApplication();
	}

	static void luanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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

	static void loginAsAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();  // minimize
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Michel");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Cleark");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("Mc@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1"); // login
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("User1@123");  // password
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("User1@123");   // re type pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("MS");
			oBrowser.findElement(By.name("lastName")).sendKeys("Dhoni");
			oBrowser.findElement(By.name("email")).sendKeys("Msd@123");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User2"); // login
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("User2@123");  // password
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("User2@123");   // re type pasword
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Virat");
			oBrowser.findElement(By.name("lastName")).sendKeys("Kholi");
			oBrowser.findElement(By.name("email")).sendKeys("vk@123");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User3"); // login
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("User3@123");  // password
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("User3@123");   // re type pasword
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("User1@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			logout();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("User2@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			logout();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("User3@123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
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
			loginAsAdmin();
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();   // click on User1      
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).click();   // click on pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("User11@123");  //  New pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User11@123");   // ReType pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();   // click on User2
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).click();   // click on pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("User22@123");  //  New pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User22@123");   // ReType pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();   // click on User3
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).click();   // click on pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("User33@123");  //  New pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User33@123");   // ReType pasword
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
			logout();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUserAgain()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("User11@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();   // logout
			Thread.sleep(1000);
			
			
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("User22@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();   // logout
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("User33@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();   // logout
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void delectUser()
	{
		try
		{
			loginAsAdmin();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();  // click on user
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();    // clcik on user1
			Thread.sleep(4000);    
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();    // click on delect
			Thread.sleep(4000);
			Alert obj1=oBrowser.switchTo().alert();
			String content=obj1.getText();
			obj1.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();   // click on User2
			Thread.sleep(1000);				
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();    // click on delect
			Thread.sleep(1000);         
			Alert obj2=oBrowser.switchTo().alert();
			String content2=obj2.getText();
			obj2.accept();
			Thread.sleep(2000);
		
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();   // click on User3
			Thread.sleep(1000);				
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();    // click on delect
			Thread.sleep(1000);
			Alert obj3=oBrowser.switchTo().alert();
			String content3=obj3.getText();
			obj3.accept();
			logout();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}	


