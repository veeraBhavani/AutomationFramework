package edu.wbqa.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage  {
	//public static String baseUrl;

	public static String baseUrl;
	
	public PageDriver driver;
	public BasePage(PageDriver driver)
	{
	this.driver= driver;
	}
	
}
