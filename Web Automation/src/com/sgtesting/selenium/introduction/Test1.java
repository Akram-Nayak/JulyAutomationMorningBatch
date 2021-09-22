package com.sgtesting.selenium.introduction;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		createUser();
		//close();
		responceTime();
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
			oBrowser.get("http://test.boxigo.in/contact-us");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@id='name'][@type='text']")).sendKeys("Hero");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Hero@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("phone")).sendKeys("1234567890");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("message")).sendKeys("Kindly Send the cort");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@value='Send Enquiry']")).submit();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void responceTime()
	{
		try
		{
			HttpURLConnection cont=(HttpURLConnection)new URL("https://www.tutorialspoint.com/index.htm")
					.openConnection();
					cont.setRequestMethod("HEAD");
					cont.connect();
					int res = cont.getResponseCode();
					System.out.println(res);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void close()
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
