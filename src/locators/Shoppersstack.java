package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/button[@id='loginBtn']")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
	}

}
