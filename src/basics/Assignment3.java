package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).sendKeys("Vidya");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("K");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("ash1990@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("tha@tho");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("tha@tho");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
	}

}
