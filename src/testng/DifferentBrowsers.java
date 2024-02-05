package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowsers {
WebDriver driver;
@Parameters("Driver")
@Test
public void browsers(String div)
{
	if(div.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		System.out.println("HI Iam from Chromedriver");
		Reporter.log("Chromedriver");
		
	}
	else if(div.equalsIgnoreCase("Edge"))
	{
		driver=new EdgeDriver();
		System.out.println("Hi Iam from Edgedriver ");
		Reporter.log("Edgedriver");
	}
	else if(div.equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
		System.out.println("Hi Iam from Firefoxdriver ");
		Reporter.log("Firefoxdriver");
		
	}
	else 
	{
		System.out.println("driver is not found");
	}
		
		
}
}
