package demo_Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA 
{
	@Test
	public void demoB()
	{
		Reporter.log("Selenium 2.53.1", true);
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\CBT\\workspace\\Shalini_Adv_Selenium\\Adv_Selenium\\Exe_Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.quit();
	}
}
