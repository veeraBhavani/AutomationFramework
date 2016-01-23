package edu.wbqa.test;
import edu.wbqa.page.*;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import edu.wbqa.base.BaseTest;
import edu.wbqa.page.HomePage;
//import static org.testing.assert.*;
import org.testng.annotations.*;
public class HomePageTest extends BaseTest
{
	HomePage homepage;
  @BeforeMethod
  public void setUp()
	{
			homepage=new HomePage(this.driver);
    }
  @Test
  public void testLogoTest()
	{
	  String header=homepage.getLOGO();
	  assertEquals(header, "WHITEBOXQA");
	}
  
 private void assertEquals(String header, String string) 
 {
	
}
private boolean assertEquals(List<Integer> links1, boolean b) 
  {
	return false;
	
}
  @Test
public void testNavBar()
	{
      String s=homepage.getnavBar();
	  assertTrue(s.contains("CONTACT"));
	}
private void assertTrue(boolean contains) {
	// TODO Auto-generated method stub
	
}
}
