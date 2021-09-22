package com.sgtesting.selenium.windowscomponent;

public class RunAutoITFileDemo {

	public static void main(String[] args) 
	{
		try
		{
		//	Runtime.getRuntime().exec("F:\\AutoIt Example\\Sample2.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("F:\\AutoIt Example\\Sample2.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
