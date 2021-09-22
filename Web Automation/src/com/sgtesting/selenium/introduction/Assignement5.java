//launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication

package com.sgtesting.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement5 {
	public static WebDriver oBrowser=null;
	public static void main(String []args)
	{
		launchBrowser();
		navigate();
		login();
		//createCustomer();
		creatProject();
		deleteProject();
		deleteCustomer();
		//logout();
		//closeapplication();
	}
	
	static void launchBrowser()
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
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click(); // mini
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();   // Click on Task
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();   // Click on Add new 
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();  // click on New Customer
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("xyz");  // click on 
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();   //
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void creatProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();   // Click on Task
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();   // Click on Add new 
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click(); // click on New Project
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Bridge project");   // Creating New Project
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("projectPopup_newCustomerNameField")).click(); // click to entre
			
			oBrowser.findElement(By.id("projectPopup_newCustomerNameField")).sendKeys("PWD Client");
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Construction of Bridge near Simdhanur");
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();  // click on project
			
			
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click(); // click on setting 
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click(); // click on action
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();  // click on delect
			
			oBrowser.findElement(By.xpath("\"//*[@id=\\'customerPanel_deleteConfirm_submitTitle\\']\"")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click(); // click on customer
			
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click(); //click on setting
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();   // click on Action 
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();  //  click on delect
			
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click(); // click on delect permanently
			
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	static void closeapplication()
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





