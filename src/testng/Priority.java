package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1,dependsOnMethods = "dws")
	public void royalenfield()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/");
		driver.quit();
		Reporter.log("REF", true);
	}
	


@Test(priority='0',invocationCount = 2,threadPoolSize = 3)
	public void dws()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.quit();
	Reporter.log("dws", true);
	}
//@Test
//public void agoda()
//{
	
}

