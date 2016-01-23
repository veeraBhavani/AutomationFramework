package edu.wbqa.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import edu.wbqa.base.BaseTest;
import edu.wbqa.page.ContactPage;
import edu.wbqa.page.HomePage;
import edu.wbqa.util.CsvUtil;

public class ContactTest extends BaseTest{
	HomePage homepage;
	ContactPage contactpage;
	  @BeforeMethod
	  public void setUp()
		{
		homepage=new HomePage(this.driver);
		contactpage=new ContactPage(this.driver);
	    }
	  @DataProvider(name="ContactData")
	  public Object[][] contactTestData() throws Exception
	  
	  {
		 // return CsvUtil.getContactData();
		 return new Object[][] {
		  {"vvv","vvv2gmail.com","555-456-4567","Hi!!"},
		  {"bbb","bbb2gmail.com","222-456-4567","Hello!!"},
		  {"ccc","ccc2gmail.com","333-456-4567","How are you?"},
		  {"ddd","ddd2gmail.com","444-456-4567","when are you coming?"}};
	  }
	 
	  @Test(dataProvider="ContactData")
	  public void testContactForm(String name,String email,String phone,String message) throws FileNotFoundException, IOException
	  {
		  homepage.gotoHome();
		  homepage.goToContactPage();
		  contactpage.sendContact(name, email, phone, message);
	  }
}
