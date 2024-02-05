package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String givenurl="https://demowebshop.tricentis.com/";
	String currenturl=driver.getCurrentUrl();
	if(givenurl.equals(currenturl))
	{
		System.out.println("You are in DWS");
		WebElement searchfield = driver.findElement(By.id("small-searchterms"));
		Actions a=new Actions(driver);
		if(searchfield.isEnabled())
		{
			System.out.println("Searchfield is enabled");
			a.moveToElement(searchfield).click().sendKeys("Vidya").build().perform();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			System.out.println("Script is successful");
			//driver.close();
			
		}
		else
		{
			System.out.println("Searchfield is not enabled");
		}
	}
	else
	{
		System.out.println("You are not in Dws page");
		System.out.println("Script is unsuccessfull");
		//driver.close();
	}
	}
}
