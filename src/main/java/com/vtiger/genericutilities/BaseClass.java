package com.vtiger.genericutilities;

import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public PropertyFileUtility pu=new PropertyFileUtility();
	public ExcelFileUtility eu=new ExcelFileUtility();
	public JavaUtility ju=new JavaUtility();
	public WebdriverUtility wu=new WebdriverUtility();
	private ChromeDriver driver;
	@BeforeSuite
	public void bsconfig()
	{
		System.out.println(("====DB CONNECTION====="));
	}
	@AfterSuite
	public void asconfig()
	{
		System.out.println(("====DB CONNECTION====="));
	}
	@BeforeClass
	public void bcconfig() throws Throwable
	{
		String BROWSER=pu.readDataFromPropertyfile("browser");
		String URL=pu.readDataFromPropertyfile("url");
		if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new ChromeDriver();
			System.out.println("Edge driver is launced");
		}
		else if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("chrome driver s launched");
		}
		else
		{
			System.out.println("invalid bro browser name");
		}

	}
}