package pages;
import base.TestBase;

public class LoginPage extends TestBase 
{

	public String verifyWebUrl()
	{
		return driver.getCurrentUrl();
		
	}
	
	public String verifywebTitle()
	{
		return driver.getTitle();
	}
	
}
