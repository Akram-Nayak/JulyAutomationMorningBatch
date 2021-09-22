package com.sgtesting.selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathAxesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonSachinTendulkar();
		selectCityNameForSachinTendulkar();
	//	makeTheStatusAsActiveForIndianFreedomFighter();
	//	fromRahulDravidFor2ndSecondEnterSalary();
	//	fromSachinTendularPrevious3rdRecordMakeStatusAsActive();
	//	getTableAttributeValue();
	//	basedOnParentTagSelectCheckBoxInSecondRow();
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
			oBrowser.get("file:///F:/HTML/WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
	}
	
	static void selectCityNameForSachinTendulkar()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/select"));
		
		oEle.findElement(By.xpath("//option[contains(text(),'Gujarath')]"));
		Select oSelect=new Select(oEle);
	//	oSelect.selectByVisibleText("Bangalore");
		oSelect.selectByIndex(3);
		oSelect.selectByValue("blore");
	}
	
	static void makeTheStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}

	static void fromRahulDravidFor2ndSecondEnterSalary()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/following::tr[1]/td[6]/input")).sendKeys("10000");
	}
	
	static void fromSachinTendularPrevious3rdRecordMakeStatusAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[1]/preceding::tr[1]/preceding::tr[1]/td[1]/input")).click();
	}
	
	static void getTableAttributeValue()
	{
		String val=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::tr/ancestor::table")).getAttribute("id");
		System.out.println(val);
	}
	
	static void basedOnParentTagSelectCheckBoxInSecondRow()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[3]/td[1]/input")).click();
	}
}
