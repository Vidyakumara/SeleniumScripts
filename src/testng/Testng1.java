package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng1 {
	@Test
public void dws() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
		Reporter.log("dws", true);
	}
@Test
public void test1()
{
	System.out.println("HI, I am from Test1");
}
@Test
public void cat()
{
	System.out.println("HI, I am from cat");
}
}
	
	

