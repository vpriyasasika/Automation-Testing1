package com.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public static void main(String args[])
	{
		
	}
	//declaration
	@FindBy(xpath="//input='[@id='username']")private WebElement untxt;
@FindBy(xpath="//input[@id='password']")private WebElement pwdtxt;
@FindBy(xpath="//input[@id='login-button']")private WebElement loginBttxt;

//intialization
public loginpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
//gettres
public WebElement getUntxt()
{
	return untxt;
	
}
public WebElement getPwdtxt() {
	return pwdtxt;
}
public void setPwdtxt(WebElement pwdtxt) {
	this.pwdtxt = pwdtxt;
}
public WebElement getLoginBttxt() {
	return loginBttxt;
}
public void setUntxt(WebElement untxt) {
	this.untxt = untxt;
}
public void loginToApp(String un,String pwd)
{
	untxt.sendKeys(un);
	pwdtxt.sendKeys(pwd);
    loginBttxt.click();
	
}

	

}

