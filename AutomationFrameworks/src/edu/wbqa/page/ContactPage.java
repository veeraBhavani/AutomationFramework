package edu.wbqa.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

import edu.wbqa.base.BasePage;
import edu.wbqa.base.PageDriver;
import edu.wbqa.util.Locator;

public class ContactPage extends BasePage
{
	public ContactPage(PageDriver driver) 
	{
		super(driver);
		
	}
	public void sendContact(String name,String email,String phone,String message) throws FileNotFoundException, IOException
	{
	driver.findElement(Locator.get("wbqa.cp.name")).sendKeys("name");
	driver.findElement(Locator.get("wbqa.cp.email")).sendKeys("email");
	driver.findElement(Locator.get("wbqa.cp.phone")).sendKeys("phone");
	driver.findElement(Locator.get("wbqa.cp.message")).sendKeys("message");
	driver.findElement(Locator.get("wbqa.cp.submit")).click();
	driver.findElement(Locator.get("wbqa.cp.clear")).click();

	}
	
 }
	

