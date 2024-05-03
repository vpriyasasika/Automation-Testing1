package com.vtiger.genericutilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	public FileInputStream fisp;
	public String readDataFromPropertyfile(String Key) throws Throwable
	{
		fisp=new FileInputStream(Iconstatutility.propertyfilepath);
		Properties p=new Properties();
		p.load(fisp);
		return p.getProperty(Key);
	}

}
