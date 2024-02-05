package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String givenUrl="https://demowebshop.tricentis.com/";
		String givenDigitaldownloadtitle="Demo Web Shop. Digital downloads";
		if(givenUrl.contains(driver.getCurrentUrl()))	
		{
			System.out.println("You are in DWS");
			driver.findElement(By.partialLinkText("Digital downloads")).click();
if(givenDigitaldownloadtitle.contains(driver.getTitle()))
{
	System.out.println("You are in Digitaldownload page");
List<WebElement> digitaldownload = driver.findElements(By.cssSelector("input[value='Add to cart']"));
for (WebElement web : digitaldownload)
{
	web.click();
	Thread.sleep(2000);
	
}
	driver.findElement(By.cssSelector("span[class='cart-label']")).click();
	WebElement shoppingcart = driver.findElement(By.cssSelector("div[class='page-title']"));
	if(shoppingcart.isDisplayed())
	{
		System.out.println("you are in shoppingcart page");
		
	}
	else
		System.out.println("You are not in shopingcart page");
}
		
		else
			System.out.println("You are not in a digitaldownload page");
	}
	else
	
	System.out.println("you are not in demowebshop");

		}
		

		}

