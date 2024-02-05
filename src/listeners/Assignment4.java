package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.StartListeners.class)
public class Assignment4 {
	@Test
	public void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String s=driver.getCurrentUrl();
		String s1="https://demowebshop.tricentis.com/";
		if(s.contains(s1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("URL is not same");
		
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		Thread.sleep(2000);
		String t=driver.getTitle();
		String t1="Demo Web Shop. Register";
		if(t.contains(t1))
		{
			System.out.println("You are in Register page");
		}
		else
			System.out.println("You are not in Register page");
		driver.findElement(By.cssSelector("input[id='gender-female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Vidya");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("K");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("thas1990@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("tha@tho");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("tha@tho");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
