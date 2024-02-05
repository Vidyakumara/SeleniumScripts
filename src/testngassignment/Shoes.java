package testngassignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Shoes {
	@Test
	public void bata()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bata.com/");
		driver.quit();
		Reporter.log("BATA", true);
	}


public class Shoes1
{
	@Test
	public void paragon()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://paragonfootwear.com/");
		driver.quit();
		Reporter.log("PARAGON", true);
		
	}

	
	public class Shoes2
	{
@Test
public void woodland()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.woodlandworldwide.com/");
			driver.quit();
			Reporter.log("WOODLAND", true);
		}
	

public class Shoes3
{
	@Test
	public void libery()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.libertyshoesonline.com/");
		driver.quit();
		Reporter.log("LIBERTY", true);
	}

	
	public class shoe4
	{
		@Test
		public void vkcpride()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://vkcpride.com/");
			driver.quit();
			Reporter.log("VKCPRIDE", true);
		}
	}
}
	}
}
}

