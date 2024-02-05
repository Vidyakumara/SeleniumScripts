package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement signup = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
		if(signup.isDisplayed()
				{
			System.out.println("Entering into the signup page successful");
			driver.findElement(By.xpath("))
				}
	}

}
