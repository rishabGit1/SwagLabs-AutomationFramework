package base;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
    public static ChromeDriver driver;
    
	public void initialization()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
}
