package com.sgtesting.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;
	private static ChromeDriver oBrowser1;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		//creatUser();
		//deleatUser();
		logout();
		closeApplication();
	}
	
	
	
	@Test(priority=1)
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web Automation\\Library\\drivers\\chromedriver.exe");
			 oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	@Test(priority=2)
	static void navigate()
	{
		try
		{
			
			oBrowser.get("http://localhost:82/reports/reports.do");
			Thread.sleep(4000);
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
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
