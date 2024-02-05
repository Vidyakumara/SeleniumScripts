package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.abhibus.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		String currenttitle_dws=driver.getTitle();
		String giventitle_dws="Demo Web Shop";
		if(giventitle_dws.contains(currenttitle_dws))
		{
			System.out.println("you are in DWS webpage");
		}
		else
			System.out.println("You are in abhibus webpage");
		driver.findElement(By.name("NewsletterEmail")).sendKeys("Vidya");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
	}
}
		
		
	

