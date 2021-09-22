package com.sgtesting.selenium.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPagePratice 
{
	public ActiPagePratice(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement oLogin;
	public WebElement getLoginButton() 
	{
		return oLogin;
	}
			
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWin()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement user;
	public WebElement getUser()
	{
		return user;
	}
	
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement adduser;
	public WebElement getAddUser()
	{
		return adduser;
	}
	
	private WebElement firstName;
	public WebElement getFirstName()
	{
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement getLastName()
	{
		return lastName;
	}
	
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement getUser1()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement userDataLightBox_passwordField;
	public WebElement getUser1Password()
	{
		return userDataLightBox_passwordField;
	}

	
	private WebElement passwordCopy;
	public WebElement getPasswordCopy()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn\']")
	private WebElement creatuser;
	public WebElement getCreatUser()
	{
		return creatuser;
	}
	
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement welcomenote;
	public WebElement getWelcomeNote()
	{
		return welcomenote;
	}
	
	// selecting user1(ms dhoni)  // 
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]")
	private WebElement selectuser1;
	public WebElement getSelectUser1()
	{
		return selectuser1;
	}
	
	// click by admin on modifypassword
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement modifynewpassword;
	public WebElement getModifyNewPassword()
	{
		return modifynewpassword;
	}

	// click by admin on modifyretyppassword
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement modifyretyppassword;
	public WebElement getModifyRetypPassword()
	{
		return modifyretyppassword;
	} 
	
	// click on save changes
	private WebElement buttonTitle;
	public WebElement getSaveChanges()
	{
		return buttonTitle;
	}
		
		
	// selecting user2(virat kholi)
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement selectuser2;
	public WebElement getSelectUser2()
	{
		return selectuser2;
	}
	// selecting user2(Rohit Sharma)
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement selectuser3;
	public WebElement getSelectUser3()
	{
		return selectuser3;
	}
		
	private WebElement delectuser;
	public WebElement getDelectUser()
	{
		return delectuser;
	}
	
	
	@FindBy(xpath="//*[@id=\'logoutLink\']")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}
