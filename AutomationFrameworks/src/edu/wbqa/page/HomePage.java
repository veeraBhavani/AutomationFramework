package edu.wbqa.page;
import edu.wbqa.page.*;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;

import edu.wbqa.base.BasePage;
import edu.wbqa.base.PageDriver;

import java.util.*;
public class HomePage extends BasePage
{
	//private static final List<Integer> y;
	public HomePage(PageDriver driver)
	{
	super(driver);
	}
	public List<Integer> countOfLinks()
	{
		 //driver.findElements(By.tagName("a"));
		//int a=driver.findElements(By.tagName("a")).size();
		 //System.out.println(a);
		List <WebElement> wb=driver.findElements(By.tagName("a"));
		for(int i=0;i<wb.size();i++)
		{
			String y = wb.get(i).getAttribute("href");
			//System.out.println(y);
			
		}
		//return y;
		return null;
		 
	}
	public String getLOGO()
	{
		String s= driver.findElement(By.cssSelector("#logo")).getText().trim();
        return s;
	}
	public String getnavBar()
	{
		
		String s1=driver.findElement(By.cssSelector("#navbar-collapse")).getText();
		
	     return s1;
	}
	public void goToContactPage()

   {
		driver.findElement(By.xpath("html/body/header/div[2]/div/ul/li[2]/a")).click();
   }
	public void gotoHome() {
		// TODO Auto-generated method stub
		
	}
	
}
