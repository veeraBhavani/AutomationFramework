package edu.wbqa.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;

public class Locator 
{
	private static HashMap<String,String> locators=null;

public static By get(String key) throws FileNotFoundException, IOException
{
	if(locators==null)
	{
	locators=new HashMap<String,String>();
	Properties p=new Properties();
	p.load(new FileReader(new File("settings.properties")));
	for(Object k : p.keySet())
	{
		locators.put((String) k, p.getProperty((String) k));
	}
	}
	String value= locators.get(key);
	return By.cssSelector(value);
	
	}
}

