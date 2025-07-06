package test_cases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import dev.failsafe.internal.util.Assert;
import pages.LoginPage;

public class LoginPage_Test extends TestBase 
{
	LoginPage login;
	@BeforeMethod
    public void setup()
    {
		initialization();
    	login = new LoginPage();
    }
    @Test
    public void verifyWebUrl_Test()
    {
    	String expURL = "https://www.saucedemo.com/";
    	String actURL = login.verifyWebUrl();
    	org.testng.Assert.assertEquals(expURL,actURL);
    	
    }
    @Test
    public void verifywebTitle_Test()
    {
    	String expTitle = "Swag Labs";
    	String actTitle = login.verifywebTitle();
    	org.testng.Assert.assertEquals(expTitle,actTitle);
    }
    
    @AfterMethod
    public void closeBrowser()
    {
    	driver.close();
    }
	
	
	
	
	
}
