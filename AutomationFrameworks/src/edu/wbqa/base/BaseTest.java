package edu.wbqa.base;
import java.util.HashMap;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import edu.wbqa.util.*;
import edu.wbqa.util.Configuration;
public class BaseTest 
{
public PageDriver driver;

 @BeforeSuite
public void setup() throws Exception
{
	 HashMap<String,String> settings = Configuration.loadSettings();
	 if(settings.get("browser").equals("forefox"))
	 {
		 driver.driver=new FirefoxDriver();
	 }
	 else if(settings.get("browser").equals("Chrome"))
	 {
		 driver.driver=new ChromeDriver();
	 }
	 else if(settings.get("browser").equals("IE"))
	 {
		 driver.driver=new InternetExplorerDriver();
	 }
	 else if(settings.get("browser").equals("Opera"))
	 {
		 driver.driver=new OperaDriver();
	 }
	 else if(settings.get("browser").equals("safari"))
	 {
		 driver.driver=new SafariDriver();
	 }
	 else if(settings.get("browser").equals("HtmlUnit"))
	 {
		 driver.driver=new HtmlUnitDriver();
	 }
	 BasePage.baseUrl=settings.get("url");
}
}
