package edu.wbqa.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageDriver 
{
	public WebDriver driver;
	public void get(String url)
	{
		driver.get(url);
	}
	public WebElement findElement(By by)
	{
		return driver.findElement(by);
	}
	public List<WebElement> findElements(By by)
	{
		return driver.findElements(by);
	}
}
