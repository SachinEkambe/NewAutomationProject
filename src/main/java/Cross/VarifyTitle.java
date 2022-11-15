package Cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class VarifyTitle {
	
	 WebDriver driver;
	@BeforeMethod
	
	public void Lunchbrowser()
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Automation\\msedgedriver.exe");
		  driver=new EdgeDriver();
	}
	@Test
	public void Url()
	{
		driver.get("https://www.google.com");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	@AfterMethod
	
	public void Quit()
	{
		driver.quit();
	}
	}


