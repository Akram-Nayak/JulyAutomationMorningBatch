package com.sgtesting.selenium.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPratice
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		//absoluteXPath();
		//tagName();
		//tagNameIndex();
		//tagNameAttribute();
		// multipleTagNameAttribute();
     	// multipleTagNameAttributeAndValueCombination();
     	// multipleTagNameAttributeOrValueCombination();
		//tagNameAttributeAndValueCombination();
		// AttributeValueAlone();
		//tagNameAndAttributeNameAlone();
		//tagNameAndAttributeNameAlone2();
		 // tagNameAndAttributeNameAlone3();
   		 // tagNameAndAttributeNameAlone4();
		//PartialAttributeValue();
		//  textContent();
		 partialTextContent();
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
			oBrowser.get("file:///F:/HTML/Sample.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void absoluteXPath() 
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("User1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void tagName()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input")).sendKeys("User1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void tagNameIndex()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("User2");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	
	static void multipleTagNameAttribute()
	{
		try
		{												
			oBrowser.findElement(By.xpath("//input[@name='submit1btn1'][@value='Submit'] ")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	static void multipleTagNameAttributeAndValueCombination()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@name='submit1btn1' and @value='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	
	static void multipleTagNameAttributeOrValueCombination()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@name='submit1btn1' or @value='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	static void tagNameAttributeAndValueCombination()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	static void AttributeValueAlone()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	static void tagNameAndAttributeNameAlone()
	{
		try
		{
			
		 List<WebElement>	 olink=oBrowser.findElements(By.xpath("//a[@href]"));
		 System.out.println("# num of links :" +olink.size()); 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 	
	// Display links 
	static void tagNameAndAttributeNameAlone2()
	{
		try
		{
			
		List<WebElement> olink=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# num of links :" +olink.size());
		for(WebElement link:olink)
		{
			String name=link.getText();
			System.out.println("The links are :"+name);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	
	static void tagNameAndAttributeNameAlone3()
	{
		try
		{
			List<WebElement> olink=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of links:" +olink.size());
			for(WebElement link:olink)
			{
				String name=link.getText();
				if(name.endsWith("Insitute"))
				{
					link.click();
					break;
				}
			}
			Thread.sleep(2000);
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	static void tagNameAndAttributeNameAlone4()
	{
		try
		{
		List<WebElement> olink=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of liks :"+olink.size());
		for(WebElement link:olink)
		{
			String name=link.getText();
			if(name.startsWith("Sel"))
			{
				link.click();
				break;
			}
		}
		Thread.sleep(2000);
		oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void PartialAttributeValue()
	{
		try
		{
		//	oBrowser.findElement(By.xpath("//input[contains(@id,'windows')]")).click();
			oBrowser.findElement(By.xpath("//input[starts-with(@name,'fire')]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	static void textContent()
	{
		try
		{
			String link="Eclipse";
			oBrowser.findElement(By.xpath("//a[text()='"+link+"']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	static void partialTextContent()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
}
/*
starts-with(text(),'partial text content')
* ends-with(text(),'partial text content')
* contains(text(),'partial text content')
* Syntax: //<tagName>[starts-with(text(),'partial text content')]
* Syntax: //<tagName>[ends-with(text(),'partial text content')]
* Syntax: //<tagName>[contains(text(),'partial text content')]
*/






